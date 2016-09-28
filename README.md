# SuperSwipeRefreshLayout
[![License](https://img.shields.io/badge/license-Apche%202.0-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0)
[![Blog](https://img.shields.io/badge/blog-Jenly-9933CC.svg)](http://blog.csdn.net/jenly121)

SuperSwipeRefreshLayout是在SwipeRefreshLayout的基础之上扩展修改，让其支持上拉刷新，基本用法与SwipeRefreshLayout一致。

![Image](https://github.com/jenly1314/SuperSwipeRefreshLayout/blob/master/gif.gif)


##引入

###Maven：
```
<dependency>
  <groupId>com.king.widget</groupId>
  <artifactId>superswiperefreshlayout</artifactId>
  <version>1.0</version>
  <type>pom</type>
</dependency>
```
###Gradle:
```
compile 'com.king.widget:superswiperefreshlayout:1.0'
```
###Lvy:
```
<dependency org='com.king.widget' name='superswiperefreshlayout' rev='1.0'>
  <artifact name='$AID' ext='pom'></artifact>
</dependency>
```

使用布局示例：
```Xml
    <com.king.widget.SuperSwipeRefreshLayout
        android:id="@+id/superSwipeRefreshLayout"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        app:direction="both">

        <android.support.v7.widget.RecyclerView
            android:id="@+id/recyclerView"
            android:layout_width="match_parent"
            android:layout_height="match_parent">

        </android.support.v7.widget.RecyclerView>

    </com.king.widget.SuperSwipeRefreshLayout>
```


代码设置刷新方向：
```Java
  superSwipeRefreshLayout.setDirection(SuperSwipeRefreshLayout.Direction.TOP);
 
  superSwipeRefreshLayout.setDirection(SuperSwipeRefreshLayout.Direction.BOTTOM);
  
  superSwipeRefreshLayout.setDirection(SuperSwipeRefreshLayout.Direction.BOTH);
```

更多使用详情请查看demo示例。

## License

    Copyright © 2015, 2016 Jenly Yu 

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

