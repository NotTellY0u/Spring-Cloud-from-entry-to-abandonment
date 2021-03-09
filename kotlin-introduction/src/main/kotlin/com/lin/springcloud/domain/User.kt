package com.lin.springcloud.domain

/**
 * @Description
 * data 修饰，
 * 自动生成toString、equals、copy、hashcode和解构函数
 * 需要注意，兰州只有牛肉面，没有拉面
 * 我已抵达上海，需要加强学习
 * 勉强算是找到工作，需要和好兄弟们吃点好东西
 * @Author        shangqing yang
 * @Date          2020/11/12 15:24
 * @ModifyDate    [修改人] [修改时间] [修改描述]
 */
data class User(
    var name: String?,
    var gender: String?,
    var weight: Int?
) {

}