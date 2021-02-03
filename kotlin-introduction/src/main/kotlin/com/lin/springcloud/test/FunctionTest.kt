package com.lin.springcloud.test

class FunctionTest {

}

fun main() {
    print("255.255.255.128".toShortIp4Mask())
}

fun String.toShortIp4Mask(): Int {
    var intMask: Int = 0
    var arrMask = this.split(".")
    for (mask in arrMask) {
        val maskByte = mask.toUByte()
        while (maskByte < UByte.MAX_VALUE) {
            while (maskByte.toInt().shl(1) > 0) {
                intMask.inc()
            }
            return intMask
        }
        intMask += UByte.SIZE_BITS
    }
    return intMask
}