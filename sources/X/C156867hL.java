package X;

import android.text.TextUtils;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7hL  reason: invalid class name and case insensitive filesystem */
public class C156867hL {
    public static final AtomicInteger A06 = new AtomicInteger();
    public final C142366x5 A00;
    public final String A01;
    public final List A02 = AnonymousClass001.A0s();
    public final List A03;
    public final List A04 = AnonymousClass001.A0s();
    public final List A05 = AnonymousClass001.A0s();

    public C156867hL(C142366x5 r3) {
        String str = "";
        this.A00 = r3;
        this.A01 = TextUtils.isEmpty(str) ? Integer.toString(A06.getAndIncrement()) : str;
        this.A03 = AnonymousClass001.A0s();
    }
}
