package X;

import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.R;
import java.math.BigDecimal;
import java.util.Map;

/* renamed from: X.9dh  reason: invalid class name and case insensitive filesystem */
public final class C197679dh implements AnonymousClass4DR {
    public final C54292oU A00;
    public final C620933l A01;
    public final C153087ae A02;
    public final C158777kX A03;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        boolean z;
        C161357pU A022;
        C85204Fi r1;
        int i;
        C166587yw r8 = (C166587yw) obj;
        AnonymousClass9KI r7 = (AnonymousClass9KI) enumR;
        boolean A1Y = AnonymousClass0x2.A1Y(r8, r7);
        boolean z2 = true;
        switch (r7.ordinal()) {
            case 0:
                return r8.A0A;
            case 1:
                String str = r8.A07.A03;
                if (!"UNSET".equals(str)) {
                    return str;
                }
                C161357pU A023 = this.A02.A02();
                if (A023 != null) {
                    return A023.A03;
                }
                return null;
            case 2:
                return this.A03.A02(r8, false);
            case 3:
                return r8.A0B;
            case 4:
                int A08 = r8.A08();
                if (Integer.valueOf(A08) == null) {
                    return "UNKNOWN";
                }
                if (A08 == A1Y) {
                    return "DEBIT";
                }
                if (A08 == 2) {
                    return "BANK";
                }
                if (A08 == 3) {
                    return "WALLET";
                }
                if (A08 == 4) {
                    return "CREDIT";
                }
                if (A08 == 5) {
                    return "MERCHANT";
                }
                if (A08 == 6) {
                    return "COMBO";
                }
                if (A08 == 7) {
                    return "CARD_UNSET";
                }
                if (A08 == 8) {
                    return "PREPAID";
                }
                return "UNKNOWN";
            case 5:
                return "UNKNOWN";
            case 6:
                return Long.valueOf(r8.A05);
            case 7:
                return Long.valueOf(r8.A06);
            case 8:
                i = r8.A01;
                break;
            case 9:
                i = r8.A00;
                break;
            case 10:
                i = r8.A03;
                break;
            case 11:
                i = r8.A02;
                break;
            case 12:
                if (!(r8 instanceof C133716hp) || (A022 = this.A02.A02()) == null || (r1 = A022.A02) == null) {
                    return null;
                }
                C60042xu r3 = new C60042xu();
                r3.A02 = r1;
                BigDecimal bigDecimal = ((C133716hp) r8).A01.A00;
                int i2 = ((AnonymousClass3H6) r1).A01;
                r3.A01 = bigDecimal.scaleByPowerOfTen(i2).longValue();
                r3.A00 = new BigDecimal(A1Y ? 1 : 0).scaleByPowerOfTen(i2).intValue();
                return r3.A01();
            case 13:
                if (r8 instanceof C133716hp) {
                    return Long.valueOf(((C133716hp) r8).A00);
                }
                return null;
            case 14:
                byte[] bArr = r8.A0D;
                if (bArr != null) {
                    return Base64.encodeToString(bArr, 2);
                }
                if (r8 instanceof C133736hr) {
                    return C107245ax.A07(BitmapFactory.decodeResource(C54292oU.A00(this.A00), R.drawable.av_card));
                }
                if (r8 instanceof C133686hm) {
                    return C107245ax.A07(BitmapFactory.decodeResource(C54292oU.A00(this.A00), R.drawable.av_bank));
                }
                return null;
            case 15:
                C620933l r0 = this.A01;
                String str2 = r8.A0A;
                String[] split = r0.A07().split(";");
                int length = split.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        String str3 = split[i3];
                        if (TextUtils.isEmpty(str3) || !str3.equalsIgnoreCase(str2)) {
                            i3++;
                        } else {
                            z = true;
                        }
                    } else {
                        z = false;
                    }
                }
                return Boolean.valueOf(z);
            case 16:
                return r8.A08;
            default:
                throw new C73153f1();
        }
        if (i != 2) {
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }

    public C197679dh(C54292oU r1, C620933l r2, C153087ae r3, C158777kX r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
    }

    public Class B3E() {
        return AnonymousClass9KI.class;
    }
}
