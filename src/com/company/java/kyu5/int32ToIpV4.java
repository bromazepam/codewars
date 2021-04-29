package com.company.java.kyu5;

/**
 * Take the following IPv4 address: 128.32.10.1
 *
 * This address has 4 octets where each octet is a single byte (or 8 bits).
 *
 *     1st octet 128 has the binary representation: 10000000
 *     2nd octet 32 has the binary representation: 00100000
 *     3rd octet 10 has the binary representation: 00001010
 *     4th octet 1 has the binary representation: 00000001
 *
 * So 128.32.10.1 == 10000000.00100000.00001010.00000001
 *
 * Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit number: 2149583361
 *
 * Complete the function that takes an unsigned 32 bit number and returns a string representation of its IPv4 address.
 * Examples
 *
 * 2149583361 ==> "128.32.10.1"
 * 32         ==> "0.0.0.32"
 * 0          ==> "0.0.0.0"
 */

public class int32ToIpV4 {
    public static String longToIP(long ip) {
        StringBuilder result = new StringBuilder(15);
        for (int i = 0; i < 4; i++) {
            result.insert(0, Long.toString(ip & 0xff));
            if (i < 3) {
                result.insert(0, '.');
            }
            ip = ip >> 8;
        }
        return result.toString();
    }
}

/**
 * explanation of code:
 * 3232235778		11000000 10101000 00000001 00000010
 * <<Loop 1>>
 * -----------------------------------------------------------
 * ip      		11000000 10101000 00000001 00000010
 * & 0xff			00000000 00000000 00000000 11111111
 * Result                  00000000 00000000 00000000 00000010 = 2
 * Result Append           .2
 *                                  -------------------------> 8
 * ip >> 8			00000000 11000000 10101000 00000001 {off 00000010}
 *
 * <<Loop 2>>
 * -----------------------------------------------------------
 * ip      		00000000 11000000 10101000 00000001
 * & 0xff			00000000 00000000 00000000 11111111
 * Result                  00000000 00000000 00000000 00000001 = 1
 * Result Append           1.2
 *                                           ----------------> 8
 * ip >> 8			00000000 00000000 11000000 10101000 {off 00000001}
 *
 * <<Loop 3>>
 * -----------------------------------------------------------
 * ip      		00000000 00000000 11000000 10101000
 * & 0xff			00000000 00000000 00000000 11111111
 * Result                  00000000 00000000 00000000 10101000 = 168
 * Result Append           168.1.2
 *                                                    -------> 8
 * ip >> 8			00000000 00000000 00000000 11000000 {off 10101000}
 *
 * <<Loop 4>>
 * -----------------------------------------------------------
 * ip      		00000000 00000000 00000000 11000000
 * & 0xff			00000000 00000000 00000000 11111111
 * Result                  00000000 00000000 00000000 11000000 = 192
 * Result Append           192.168.1.2
 *                                                             -----------> 8
 * ip >> 8			00000000 00000000 00000000 00000000 {off 11000000}
 */

/** simpler solution
 * return InetAddresses.fromInteger((int) ip).getHostAddress();
 */