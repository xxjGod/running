package com.xxj;

public class GetJavaVersion {


    public static void main(String[] args) {
        String version = System.getProperty("java.version");
        if (version.startsWith("1.")) {

            version = version.substring(2, 3);

        } else {
            int pos = version.indexOf(".");

            if (pos != -1) {
                version = version.substring(0, pos);
            } else {
                version = version;
            }

        }
        System.out.println(version);
    }
}
