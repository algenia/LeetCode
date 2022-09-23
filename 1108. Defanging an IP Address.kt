// https://leetcode.com/problems/defanging-an-ip-address/

class Solution {
    fun defangIPaddr(address: String): String = address.replace(".", "[.]")
}
