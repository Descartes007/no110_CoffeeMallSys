<h1 align="center">基于Spring Boot + Vue 的咖啡商城系统【带论文】</h1></p>

- <b>完整代码获取地址：从戎源码网 ([https://armycodes.com/](https://armycodes.com/))</b>
- <b>技术探讨、资料分享，请加QQ群：692619798</b>
- <b>作者微信：19941326836  QQ：3645296857</b>
- <b>承接计算机毕业设计、Java毕业设计、Python毕业设计、深度学习、机器学习</b>
- <b>选题+开题报告+任务书+程序定制+安装调试+论文+答辩ppt 一条龙服务</b>
- <b>所有选题地址 ([https://github.com/Descartes007/allProject](https://github.com/Descartes007/allProject)) </b>

## 一、项目介绍

基于 Spring Boot + Vue 的咖啡商城系统，系统角色为“管理员”和“顾客”，主要功能如下
### 顾客：
- 基本操作：注册、登录、找回密码、修改密码、获取/修改个人信息
- 购物流程：浏览商城首页、商品列表、商品详情、按名称/类别/品牌搜索商品
- 购物车：加入购物车、修改购物车商品、删除购物车商品、查询购物车
- 下单与支付：单商品下单、购物车批量下单（生成临时订单信息到 Redis）、调用支付（支付宝）
- 订单管理：查看我的订单、查看订单详情、确认收货
- 退货/售后：发起退货申请、查看退货进度
- 评价：对已购商品进行评价
- 会员：购买/管理 VIP（会员到期设置）
- 校验与通知：邮箱验证码、短信验证码（绑定/验证）、接收注册/授权/重置密码邮件
### 管理员：
- 基本操作：登录、修改密码、获取/修改个人信息
- 商品管理：商品增删改查、上下架、库存变更、查询商品统计
- 分类/品牌/规格管理：商品类别、品牌、规格的增删改查与校验
- 订单管理：订单列表、订单详情、创建/修改/删除订单、确认收货、订单信息导出/临时缓存
- 退货与物流：退货原因配置、退货申请审核、退款处理、物流信息管理、退货处理流程（拒绝/受理/发回等）
- 采购管理：供应商管理、采购单管理、入库/收货确认
- 用户与权限管理：管理员列表、顾客列表、角色管理、用户角色授权、发送授权邮件
- 营销管理：轮播图(Banner)管理
- 支付与第三方：支付宝支付回调/集成、阿里云短信、邮件服务
- 运营与统计：概览面板/运营接口、各类数量统计与报表

## 二、项目技术

- 编程语言：Java（后端），JavaScript + Vue（前端）
- 项目架构：B/S 架构（前后端分离）
- 前端技术：Vue 2.x、vue-router、vuex、Element UI、axios、echarts/v-charts、webpack
- 后端技术：Spring Boot（Controller/Service 架构）、统一返回封装 CommonResult、MySQL 、Redis（RedisTemplate 用于验证码、订单临时数据等）


## 三、运行环境

- JDK版本：1.8及以上都可以
- 操作系统：Windows7/10、MacOS
- 开发工具：IDEA、Ecplise、MyEclipse都可以

## 四、数据库配置文件

- npm版本：6.14.13及以上都可以
- Redis版本：3.2.100及以上都可以
- 文件名：application.yml、application-mail.yml、application-jdbc.yml、application-redis.yml
- 编码类型：utf8

## 论文截图

![](screenshot/1.png)

![](screenshot/2.png)

## 系统截图

![](screenshot/3.png)

![](screenshot/4.png)

![](screenshot/5.png)

![](screenshot/6.png)

![](screenshot/7.png)

![](screenshot/8.png)

![](screenshot/9.png)

![](screenshot/10.png)

![](screenshot/11.png)

![](screenshot/12.png)
