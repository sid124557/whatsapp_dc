package org.npci.upi.security.services;

import android.os.IInterface;

public interface CLRemoteService extends IInterface {
    void B2r(String str);

    String B5L(String str, String str2);

    void B6F(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, CLResultReceiver cLResultReceiver);

    boolean Bib(String str, String str2, String str3, String str4, String str5);
}
