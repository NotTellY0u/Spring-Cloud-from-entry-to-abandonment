package com.lin.springcloud.grammer

import com.lin.springcloud.domain.User
import java.time.LocalDateTime

/**
 * @Description
 * 1.类默认使用 final修饰，
 * @Author        shangqing yang
 * @Date          2020/11/12 16:42
 * @ModifyDate    [修改人] [修改时间] [修改描述]
 */
class Grammer {
    /**
     * @Description:
     * 1.可变声明和不可变声明
     * 2.自动推导类型
     * @Author shangqing yang
     * @Date:  2020/11/12 16:03
     */
    fun declaration(){
        var nameChangeAble = "Calvin"
        val nameUnChangeAble = "Calvin" //val类型必需初始化
        nameChangeAble = "Yang"
    }
    /**
     * @Description:一种方法声明
     * @Author shangqing yang
     * @Date:  2020/11/12 16:05
     */
    private fun getName():String = "Calvin"
    /**
     * @Description:延迟初始化
     * @Author shangqing yang
     * @Date:  2020/11/12 16:04
     */
    fun lazyInitialize(){
        val name:String by lazy{getName()}
        val name1 by lazy(::getName)
    }

    /**
     * @Description:
     * 1.class 默认 final，使用open修饰可继承
     * 2.默认构造方法
     * @Author shangqing yang
     * @Date:  2020/11/12 16:46
     */
    open class OpenClass constructor(open:Boolean = true,time:LocalDateTime = LocalDateTime.now())
    class DefaultFinalClass():OpenClass(time = LocalDateTime.now())

    /**
     * @Description:
     * 伴生对象（静态属性和方法）
     * @Author shangqing yang
     * @Date:  2020/11/12 16:48
     */
    companion object{
        const val number1 = 1
        private var number2 = 2
        fun outNumber2():Int{
            return number2
        }
    }
    /**
     * @Description:
     * data修饰类（数据类）可解构
     * @Author shangqing yang
     * @Date:  2020/11/13 9:21
     */
    fun destructure(){
        val fatManList = listOf<User>(User("芭蕉","男",200))
        for((name,gender,weight) in fatManList){
            print(name + "的体重是" + weight)
        }
    }
    /**
     * @Description: 单例对象
     * @Author shangqing yang
     * @Date:  2020/11/13 9:37
     */
    object ObjectClass{
        const val CHICKEN = "鸡"
        const val PIG = "猪"
    }
    /**
     * @Description:可变集合与不可变集合
     * @Author shangqing yang
     * @Date:  2020/11/13 9:45
     */
    fun testCollection(){
        val changeAbleList = mutableListOf<Int>(1,2,3,4)
        changeAbleList.add(5)

        val unChangeAbleList1 = listOf<Int>(1,2,3,4)
        val unChangeAbleList2 = listOf<Int>(5)
        val unChangeAbleList3 = unChangeAbleList1 + unChangeAbleList2
    }

    fun outFunction(str:String):String{
        fun innerFunction1(str:String):String{
            return "1:${str}"
        }
        fun innerFunction2(str:String):String{
            return "2:${str}"
        }
        return "${innerFunction1(str)} ${innerFunction2(str)}"
    }




}