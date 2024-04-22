深 圳 大 学 实 验 报 告


      课程名称：            移动互联网应用             

      实验项目名称：             我的头条        


实验目的与要求：
目的：掌握安卓中活动的编写、自定义用户界面的开发、能使用HTTP协议访问网络；并能通过自学能适当完善该APP界面，并使界面尽量美观。
内容要求：
1. 请尽量模拟如下APP界面的功能，参考：
https://play.google.com/store/apps/details?id=mark.h.my_news_app&hl=en_US

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/3336f606-3192-4061-82da-76fd48f9e25f)

3. 该实现的界面应至少包含3个菜单，分别展示个人3个方面的信息，菜单之间要表现出一定的差异性；每个菜单可以包含2-5个条目，每个条目能响应个人某方面的偏好信息；此外，如果是响应网页，需同时体现出a) 采用浏览器浏览 与 b) 下载到本地 两种技术方案。
4. 尽量多的应用参考书《第一行代码 Android》第二版第2章（活动）、第3章（UI开发）与第9章（网络技术）的访问网络相关知识点；其中第9章技术点不作强行要求。

注意：
1. 实验报告中需要有功能的描述、实验结果的截屏图像及详细说明；
2. 也欢迎采用其它章节的知识点完成本次实验报告，如果实现的功能言之合理，会考虑酌情加分；
3. 尽量删除空白页。

方法、步骤：
根据课本和查询资料，最上方做了个recyclerview，下面留了FrameLayout。根据点击项目的不同，能够将下面碎片布局换成不同的布局。

实验过程及内容：
## 效果：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/3a064f2e-3ef5-474c-b538-a89e0c0ff968)

上面横栏图片是我下载存到本地draw文件夹的图片。
下方新闻列表的图片用的是Picasso显示的URL。

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/28eca613-be47-4d8e-902a-6d5bd3ce263e)

目前每个分类更换下面的碎片成为的Recycler都是写死的。
比如Sports，下面的第一个项被我替换为了别的。经测试可以正常替换。
每个元素都是按钮，包括下面的文字图片。都有Toast响应。

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/2a46921d-1dce-416c-935a-3766bed11f1d)

## 代码分析：
Gradle中引入需要用的外部包，并及时sync

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/e5fc3501-f66d-47b8-b115-48b03d46802f)

注册文件中注册了主活动，并且声明了访问网络的权限：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/3042dab0-b650-428c-a010-665b060d93f9)

主布局中安排了最上方的横向列表和下面的碎片：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/0f6e6b84-c33c-43d2-bf5d-3bae0a9f7329)

0dp指的是交给系统自己分配合适的空间大小。

无论是上方的选项还是下面的列表选项，每个选项都是单独的LinearLayout

## 上方布局：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/751facf6-49ba-4620-ae7e-9c28cd82d263)

使用”fitXY”可以使我的图片适应填充满目标区域

## 下方每项布局：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/ea62e09b-bb3b-45ad-ae0b-e9d8d0b998f0)

使用了singleLine = “flase” ，当文本足够长时，会自动换行。

## 活动：

活动：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/be264148-6476-4005-92db-92f1b83f4d67)

元素类：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/4e1b3c28-28d3-4a2d-b419-3199bf0fabd2)

就是简单的成员，构造，以及get

适配器Adapter:

这里重要的就是想给下面碎片更换，需要获取主活动，才能通过
getSupportFragmentManager()来获取碎片管理器。

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/30ec7722-8296-430c-8e3d-2c9bc77bdedb)

类内类有ViewHolder，用来实现视图中显示每项元素的。
其余部分类似课本碎片节相关代码。
其中按钮功能：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/8ad9d3cf-5dc4-4892-8924-cc5df1972bdb)

获取到点击位置的元素，可以得到其结构体，就可以根据名字的不同来替换不同的下方列表碎片。

下方列表几乎和这个列表相同，只是做了些调整：
每个列表都有独立的实现。

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/354e33c6-86e1-41fc-90c9-a25a905fba63)

Business的构造：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/1a38fb09-693f-49a2-88f3-b446c34c127a)

第一个图片的URL：
https://img0.baidu.com/it/u=743086653,3308529542&fm=253&fmt=auto&app=120&f=JPEG?w=539&h=305

本地drawable的图片：

![image](https://github.com/lubenweiNBNBNBNB/my_headline/assets/109973657/284f6446-e328-48c7-872b-f68bb1a41d87)

实验结论：
学习并练习了fragment碎片的布局方式及替换，以及recycler的布局和按钮的实现
