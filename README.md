## LockPattern简介
*  可以实现 N*N 宫格的解锁屏，且为纯代码实现
*  最低兼容android 2.2 (api level 8)

## LockPattern使用方法
* 将com.iwilliam.view.LockPattern引入您的工程
* 在对应的layout布局文件中定义该控件

	    <com.iwilliam.view.LockPattern
	  	android:id="@+id/lockPattern9"
	  	android:layout_width="match_parent"
	    android:layout_height="match_parent"/>

* 在对应Activity中设置setOnCompleteListener监听即可


简单三步就能搞定N*N宫格解锁屏

默认为3*3九宫格，默认最小密码长度为4

强烈建议AndroidManifest.xml中对应的Activity加入android:screenOrientation="portrait"强制竖屏

##关于作者
* Email： <iwilliam@yeah.net>
* 有任何建议或者使用中遇到问题都可以给我发邮件，也欢迎大家不断优化重构 O(∩_∩)O~
