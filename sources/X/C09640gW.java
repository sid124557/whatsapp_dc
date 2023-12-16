package X;

import android.text.TextUtils;
import android.util.LruCache;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.0gW  reason: invalid class name and case insensitive filesystem */
public class C09640gW implements C17130uc {
    public final int A00;
    public final int A01;
    public final long A02;
    public final SparseArray A03;
    public final String A04;
    public final HashMap A05;
    public final List A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final boolean A0A;

    public boolean equals(Object obj) {
        if (!(obj instanceof C09640gW)) {
            return false;
        }
        C09640gW r4 = (C09640gW) obj;
        String str = this.A04;
        String str2 = r4.A04;
        if (str == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str.equals(str2)) {
            return false;
        }
        if (!this.A05.equals(r4.A05)) {
            return false;
        }
        if (!TextUtils.isEmpty((CharSequence) null)) {
            throw AnonymousClass001.A0g("equals");
        } else if (TextUtils.isEmpty((CharSequence) null)) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        int hashCode;
        String str = this.A04;
        HashMap hashMap = this.A05;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int A022 = AnonymousClass002.A02(hashMap, hashCode * 31);
        if (TextUtils.isEmpty((CharSequence) null)) {
            return A022;
        }
        throw AnonymousClass001.A0g("hashCode");
    }

    public C09640gW(AnonymousClass0TK r6) {
        int hashCode;
        String str = r6.A01;
        this.A04 = str;
        HashMap hashMap = r6.A02;
        HashMap hashMap2 = hashMap;
        this.A05 = hashMap == null ? AnonymousClass001.A0t() : hashMap;
        this.A08 = AnonymousClass001.A0t();
        this.A09 = AnonymousClass001.A0t();
        int i = r6.A00;
        this.A01 = i <= 0 ? 719983200 : i;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = (hashCode * 31) + (hashMap2 != null ? hashMap2.hashCode() : i2);
        if (TextUtils.isEmpty((CharSequence) null)) {
            synchronized (AnonymousClass0SU.class) {
                LruCache lruCache = AnonymousClass0SU.A00;
                Integer valueOf = Integer.valueOf(hashCode2);
                Integer num = (Integer) lruCache.get(valueOf);
                hashCode2 = num != null ? (num.intValue() + 1) * 31 : hashCode2;
                lruCache.put(valueOf, Integer.valueOf(hashCode2));
            }
            this.A00 = hashCode2;
            this.A02 = C09910gx.A00().now();
            this.A06 = r6.A03;
            this.A03 = new SparseArray();
            Map map = r6.A04;
            this.A07 = map == null ? AnonymousClass001.A0t() : map;
            this.A0A = r6.A05;
            return;
        }
        throw AnonymousClass001.A0g("hashCode");
    }
}
