package com.salesforce.androidsdk.analytics.security;

public enum CipherMode {
    AES_CBC_CIPHER("AES/CBC/PKCS5Padding"),
    AES_GCM_CIPHER("AES/GCM/NoPadding"),
    RSA_PKCS1("RSA/ECB/PKCS1Padding"),
    RSA_OAEP_SHA256("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");

    final String fullName;

    CipherMode(String fullName) {
        this.fullName = fullName;
    }
}
