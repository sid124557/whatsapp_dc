package X;

import android.content.ContentValues;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2px  reason: invalid class name and case insensitive filesystem */
public class C55192px {
    public final C72303dV A00;
    public final AnonymousClass1VX A01;

    public final AnonymousClass39R A00(Cursor cursor, String str) {
        Cursor cursor2 = cursor;
        String str2 = str;
        if (str == null) {
            str2 = AnonymousClass0x2.A0Z(cursor2, "background_id");
        }
        long A0C = AnonymousClass0x2.A0C(cursor2, "file_size");
        int A04 = AnonymousClass0x2.A04(cursor2, "width");
        int A042 = AnonymousClass0x2.A04(cursor2, "height");
        AnonymousClass39R r10 = new AnonymousClass39R(str2, AnonymousClass0x2.A0Z(cursor2, "mime_type"), AnonymousClass0x2.A0Z(cursor2, "fullsize_url"), AnonymousClass0x2.A0Z(cursor2, "description"), AnonymousClass0x2.A0Z(cursor2, "lg"), A04, A042, AnonymousClass0x2.A04(cursor2, "placeholder_color"), AnonymousClass0x2.A04(cursor2, "text_color"), AnonymousClass0x2.A04(cursor2, "subtext_color"), A0C);
        AnonymousClass1VX r9 = this.A01;
        C58422vE r7 = C58422vE.A02;
        if (r9.A0Y(r7, 1084)) {
            byte[] A1Z = C18280x3.A1Z(cursor2, "media_key");
            long A0C2 = AnonymousClass0x2.A0C(cursor2, "media_key_timestamp");
            String A0Z = AnonymousClass0x2.A0Z(cursor2, "file_sha256");
            String A0Z2 = AnonymousClass0x2.A0Z(cursor2, "file_enc_sha256");
            String A0Z3 = AnonymousClass0x2.A0Z(cursor2, "direct_path");
            boolean A0Y = r9.A0Y(r7, 1084);
            r10.A08 = A1Z;
            r10.A00 = A0C2;
            r10.A04 = A0Z;
            r10.A03 = A0Z2;
            r10.A02 = A0Z3;
            r10.A07 = A0Y;
        }
        return r10;
    }

    public final void A03(C85284Fq r9, AnonymousClass39R r10, String str) {
        byte[] bArr;
        long j;
        String str2;
        String str3;
        int i;
        String str4 = r10.A05;
        boolean A1U = C18320x8.A1U(str4);
        boolean A0Y = this.A01.A0Y(C58422vE.A02, 1084);
        ContentValues A07 = AnonymousClass0x9.A07(15);
        String str5 = r10.A0F;
        A07.put("background_id", str5);
        A07.put("file_size", Long.valueOf(r10.A0E));
        A07.put("width", Integer.valueOf(r10.A0D));
        A07.put("height", Integer.valueOf(r10.A09));
        A07.put("mime_type", r10.A0G);
        A07.put("placeholder_color", Integer.valueOf(r10.A0A));
        A07.put("text_color", Integer.valueOf(r10.A0C));
        A07.put("subtext_color", Integer.valueOf(r10.A0B));
        String str6 = null;
        if (A0Y) {
            bArr = r10.A08;
        } else {
            bArr = null;
        }
        C621833x.A04(A07, "media_key", bArr);
        if (A0Y) {
            j = r10.A00;
        } else {
            j = 0;
        }
        A07.put("media_key_timestamp", Long.valueOf(j));
        if (A0Y) {
            str2 = r10.A04;
        } else {
            str2 = null;
        }
        C621833x.A02(A07, "file_sha256", str2);
        if (A0Y) {
            str3 = r10.A03;
        } else {
            str3 = null;
        }
        C621833x.A02(A07, "file_enc_sha256", str3);
        if (A0Y) {
            str6 = r10.A02;
        }
        C621833x.A02(A07, "direct_path", str6);
        if (A1U) {
            A07.put("fullsize_url", str4);
            C621833x.A02(A07, "description", r10.A01);
            C621833x.A02(A07, "lg", r10.A06);
            i = 5;
        } else {
            i = 4;
        }
        if (((AnonymousClass3H0) r9).A03.A0C("payment_background", str, A07, i) == -1) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/shouldReplace: ");
            A0o.append(A1U);
            C18260x0.A0r(", failed for id: ", str5, A0o);
        }
    }

    public C55192px(C72303dV r1, AnonymousClass1VX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public AnonymousClass39R A01(String str) {
        Cursor A0E;
        C18260x0.A0s("PAY: PaymentBackgroundStore/getPaymentBackgroundById/id=", str, AnonymousClass001.A0o());
        AnonymousClass4GK A03 = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E("SELECT file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background WHERE background_id =?", "payments/QUERY_PAYMENT_BACKGROUND_BY_ID", C18270x1.A1b(str));
            if (A0E.moveToNext()) {
                AnonymousClass39R A002 = A00(A0E, str);
                A0E.close();
                A03.close();
                return A002;
            }
            A0E.close();
            C18260x0.A0s("PAY: PaymentBackgroundStore/getPaymentBackgroundById/no background found for id=", str, C18280x3.A0f(A03));
            return null;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public final List A02(String str, String str2) {
        Cursor A0E;
        ArrayList A0s = AnonymousClass001.A0s();
        AnonymousClass4GK A03 = this.A00.get();
        try {
            A0E = ((AnonymousClass3H0) A03).A03.A0E(str, str2, (String[]) null);
            while (A0E.moveToNext()) {
                A0s.add(A00(A0E, (String) null));
            }
            A0E.close();
            A03.close();
            return A0s;
        } catch (Throwable th) {
            try {
                A03.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A04(AnonymousClass39R r4) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PAY: PaymentBackgroundStore/insertOrReplacePaymentBackground/id=");
        C18260x0.A1L(A0o, r4.A0F);
        C85284Fq A04 = this.A00.A04();
        try {
            A03(A04, r4, "payments/INSERT_PAYMENT_BACKGROUND");
            A04.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }
}
