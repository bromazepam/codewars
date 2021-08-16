package com.company.java.kyu5;

import java.net.InetAddress;
import java.nio.ByteBuffer;

/**
 * Implement a function that receives two IPv4 addresses, and returns the number of addresses between them
 * (including the first one, excluding the last one).
 * All inputs will be valid IPv4 addresses in the form of strings.
 * The last address will always be greater than the first one.
 */

public class CountIpAddresses {
    public static long ipsBetween(String start, String end) {
        try {
            InetAddress bar = InetAddress.getByName(start);
            int s = ByteBuffer.wrap(bar.getAddress()).getInt();

            InetAddress bar2 = InetAddress.getByName(end);
            int e = ByteBuffer.wrap(bar2.getAddress()).getInt();
            return e - s;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return -1;
    }
}
