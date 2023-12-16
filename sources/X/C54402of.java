package X;

import android.content.SharedPreferences;

/* renamed from: X.2of  reason: invalid class name and case insensitive filesystem */
public final class C54402of {
    public C72333dY A00 = C72333dY.A05(this, 12);
    public final C60152y5 A01;

    public C54402of(C60152y5 r2) {
        C162457s7.A0J(r2, 1);
        this.A01 = r2;
    }

    public final String A01(String str) {
        C162457s7.A0J(str, 0);
        return C18280x3.A0Z((SharedPreferences) this.A00.get(), AnonymousClass000.A0V("flows_biz_public_key_pem_", str, AnonymousClass001.A0o()));
    }

    public final void A02(long j, String str, String str2) {
        C162457s7.A0J(str, 0);
        SharedPreferences.Editor A002 = C72333dY.A00(this.A00);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("extensions_metadata_banned_");
        A0o.append(str);
        A0o.append('_');
        C18270x1.A0k(A002, str2, A0o, j);
    }

    public final long A00(String str, String str2) {
        C18260x0.A0O(str, str2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("extensions_metadata_banned_");
        A0o.append(str);
        return AnonymousClass0x2.A0B((SharedPreferences) this.A00.get(), AnonymousClass0x2.A0e(str2, A0o, '_'));
    }
}
