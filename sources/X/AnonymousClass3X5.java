package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.util.Base64;

/* renamed from: X.3X5  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3X5 implements C84134Bd {
    public final /* synthetic */ C47172cp A00;
    public final /* synthetic */ C64833Fe A01;
    public final /* synthetic */ AnonymousClass3QO A02;
    public final /* synthetic */ AnonymousClass39M A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ byte[] A05;

    public final void AwB(Object obj) {
        int intValue;
        Cursor A0E;
        long j;
        int intValue2;
        int intValue3;
        C64833Fe r3 = this.A01;
        AnonymousClass3QO r5 = this.A02;
        String str = this.A04;
        AnonymousClass39M r1 = this.A03;
        byte[] bArr = this.A05;
        C47172cp r26 = this.A00;
        C149897Oi A022 = r5.A02();
        r5.A03();
        int intValue4 = ((Number) obj).intValue();
        if (intValue4 == 0 && A022 != null) {
            C56752sV r25 = A022.A02;
            if (r25.A03() != null) {
                C18260x0.A0q("NonMessageDataRequestManager/uploadSticker upload success, hash=", str, AnonymousClass001.A0o());
                AnonymousClass2YS r0 = r3.A0F;
                AnonymousClass5LM r6 = r5.A0L;
                r6.A05 = System.currentTimeMillis();
                r0.A01.A03(r6);
                String str2 = r1.A0D;
                C626936e.A06(str2);
                int i = 0;
                String encodeToString = Base64.encodeToString(bArr, 0);
                r1.A0G = r25.A07();
                r1.A06 = r25.A03();
                r1.A0B = encodeToString;
                r1.A08 = r25.A05();
                C183538qC r52 = r3.A0K;
                if (AnonymousClass0x9.A0a(r52).A0J(str2)) {
                    C27841el A0a = AnonymousClass0x9.A0a(r52);
                    String A06 = r25.A06();
                    String A07 = r25.A07();
                    String A052 = r25.A05();
                    String A032 = r25.A03();
                    String str3 = r1.A0C;
                    int i2 = (int) A022.A01.A02.A03;
                    if (r25.A02() == null) {
                        intValue2 = 0;
                    } else {
                        intValue2 = r25.A02().intValue();
                    }
                    if (r25.A01() == null) {
                        intValue3 = 0;
                    } else {
                        intValue3 = r25.A01().intValue();
                    }
                    A0a.A0H(A06, A07, A052, A032, str3, encodeToString, r1.A07, i2, intValue2, intValue3, r1.A0K, r1.A0L);
                }
                C54962pZ r12 = r3.A0H;
                if (r12.A02(str2)) {
                    String A062 = r25.A06();
                    String A072 = r25.A07();
                    String A053 = r25.A05();
                    String A033 = r25.A03();
                    String str4 = r1.A0C;
                    int i3 = (int) A022.A01.A02.A03;
                    if (r25.A02() == null) {
                        intValue = 0;
                    } else {
                        intValue = r25.A02().intValue();
                    }
                    if (r25.A01() != null) {
                        i = r25.A01().intValue();
                    }
                    String str5 = r1.A07;
                    boolean z = r1.A0K;
                    C60602yp r122 = r12.A05;
                    ContentValues A063 = AnonymousClass0x9.A06();
                    A063.put("url", A072);
                    A063.put("enc_hash", A053);
                    A063.put("direct_path", A033);
                    A063.put("mimetype", str4);
                    A063.put("media_key", encodeToString);
                    C18270x1.A0b(A063, "file_size", i3);
                    C18270x1.A0b(A063, "width", intValue);
                    C18270x1.A0b(A063, "height", i);
                    A063.put("emojis", str5);
                    AnonymousClass0x2.A0o(A063, "is_first_party", z);
                    C183538qC r62 = r122.A01;
                    AnonymousClass4GK A08 = C18630y0.A08(r62);
                    try {
                        ((AnonymousClass3H0) A08).A03.A05(A063, "starred_stickers", "plaintext_hash = ?", "updateStickerAttrsByFileHash/UPDATE_STARRED_STICKERS", C18270x1.A1b(A062));
                        A08.close();
                        C626936e.A00();
                        String[] A1b = C18270x1.A1b(str2);
                        A08 = C18630y0.A04(r62);
                        A0E = ((AnonymousClass3H0) A08).A03.A0E("SELECT timestamp FROM starred_stickers WHERE plaintext_hash = ?", "getStickerStarredTimestamp/GET_STARRED_STICKER_TIMESTAMP_BY_PLAIN_HASH ", A1b);
                        if (A0E.moveToNext()) {
                            j = AnonymousClass0x2.A0C(A0E, "timestamp");
                            A0E.close();
                            A08.close();
                        } else {
                            A0E.close();
                            A08.close();
                            j = -1;
                        }
                        C65203Gp r9 = r3.A06;
                        if (r9 != null && j > 0) {
                            C18260x0.A0q("NonMessageDataRequestManager/updateSticker update the fav sticker mutation, fileHash=", str2, AnonymousClass001.A0o());
                            r9.A0O(r9.A0A(r1, j, true));
                        }
                    } catch (Throwable th) {
                        try {
                            A08.close();
                            throw th;
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                }
                C33071sO r53 = r3.A0I;
                synchronized (r53) {
                    C04840Qw r4 = r53.A00;
                    if (r4 == null) {
                        r4 = new C04840Qw(60);
                        r53.A00 = r4;
                    }
                    r4.A08(str2, r1);
                }
                r26.A00(AnonymousClass23E.SUCCESS, r1, str, true);
                return;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("NonMessageDataRequestManager/uploadSticker/failed to upload, error:");
        C18260x0.A1K(A0o, C154357d2.A00(intValue4));
        r26.A00(AnonymousClass23E.GENERAL_ERROR, (AnonymousClass39M) null, str, false);
        return;
        throw th;
    }

    public /* synthetic */ AnonymousClass3X5(C47172cp r1, C64833Fe r2, AnonymousClass3QO r3, AnonymousClass39M r4, String str, byte[] bArr) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = str;
        this.A03 = r4;
        this.A05 = bArr;
        this.A00 = r1;
    }
}
