package X;

import android.util.Base64;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: X.9LN  reason: invalid class name */
public class AnonymousClass9LN {
    public static boolean A00(String str, byte[] bArr) {
        byte[] decode = Base64.decode(str, 0);
        Signature instance = Signature.getInstance("SHA256withRSA");
        instance.initVerify(KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAxj0ym0SqSduZYfRk73qv\nj3WfGfzt76TUqcSDwDURn4Qlw4mMIgmI+WOGASQw8A97Q9SeohkZzL29HPuOPceV\n+pkmBl7LQ+BnyxvifXkohvzITpWFEwkDLlrf4lVSm7mizW8tYq1M+b65TRXFQZPO\nhdowDrdrAwR1K/T+1yppCL1zrE8YOBQf3/gFGrdKRWmGiaq+/5Zf9NKT0b5+FFBu\nP+rKp/t9aMITn9JBOI9OxP6lALyibqgf8Lbe91dT0NZOZKF1Ps5foLBsURVr40v+\nG08E8ovPO7k64OPSW8CUsmlPU0yesEiU99YLMac8oWJAwbjlV/g9SmqmkHLRcq7w\nrwIDAQAB\n", 0))));
        instance.update(bArr);
        return instance.verify(decode);
    }
}
