package X;

import android.util.Base64;
import com.whatsapp.stickers.WebpUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* renamed from: X.2qp  reason: invalid class name and case insensitive filesystem */
public final class C55732qp {
    public final C59962xm A00;
    public final WebpUtils A01;

    public C55732qp(C59962xm r2, WebpUtils webpUtils) {
        C162457s7.A0J(webpUtils, 1);
        this.A01 = webpUtils;
        this.A00 = r2;
    }

    public final AnonymousClass39M A00(AnonymousClass1nE r27) {
        String str;
        AnonymousClass1nE r4 = r27;
        C162457s7.A0J(r4, 0);
        AnonymousClass39M r6 = new AnonymousClass39M((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, false, false, false, false, false);
        AnonymousClass33C r5 = r4.A01;
        if (r5 != null) {
            File file = r5.A0F;
            String A1x = r4.A1x();
            if (file != null && file.exists()) {
                AnonymousClass39M.A01(r6, file);
                r6.A01 = 1;
            } else if (A1x != null) {
                r6.A09 = A1x;
                r6.A01 = 3;
            }
            r6.A0D = r4.A04;
            r6.A08 = r4.A03;
            r6.A03 = r5.A08;
            r6.A02 = r5.A06;
            r6.A0C = r4.A05;
            byte[] bArr = r5.A0W;
            if (bArr != null) {
                str = Base64.encodeToString(bArr, 1);
            } else {
                str = null;
            }
            r6.A0B = str;
            String str2 = r5.A0G;
            if (str2 != null) {
                r6.A06 = str2;
            }
        }
        r6.A0L = r4.A24();
        A04(r6);
        return r6;
    }

    public final AnonymousClass330 A03(String str, byte[] bArr) {
        StringBuilder sb;
        String str2;
        C162457s7.A0J(bArr, 0);
        if (!"application/was".equals(str)) {
            return AnonymousClass330.A01(bArr);
        }
        try {
            return AnonymousClass330.A00(AnonymousClass0x9.A1H(new String(bArr, AnonymousClass79X.A05)).getJSONObject("metadata").getJSONObject("customProps"));
        } catch (JSONException e) {
            e = e;
            sb = AnonymousClass001.A0o();
            str2 = "LottieUtils/getMetadataFromBytes error getting metadata json ";
            C18260x0.A17(str2, sb, e);
            return null;
        } catch (IOException e2) {
            e = e2;
            sb = AnonymousClass001.A0o();
            str2 = "LottieUtils/getMetadataFromBytes exception retrieving lottie file ";
            C18260x0.A17(str2, sb, e);
            return null;
        }
    }

    public final void A05(List list) {
        String str;
        C162457s7.A0J(list, 0);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass39M A0b = AnonymousClass0x7.A0b(it);
                if (!(A0b.A04 != null || (str = A0b.A09) == null || str.length() == 0)) {
                    A04(A0b);
                }
            }
        }
    }

    public final AnonymousClass330 A02(File file, String str) {
        C369420i r0;
        boolean equalsIgnoreCase = "application/was".equalsIgnoreCase(str);
        String absolutePath = file.getAbsolutePath();
        if (equalsIgnoreCase) {
            C162457s7.A0D(absolutePath);
            r0 = C369420i.LOTTIE;
        } else {
            C162457s7.A0D(absolutePath);
            r0 = C369420i.WEBP;
        }
        return A01(r0, absolutePath);
    }

    public final void A04(AnonymousClass39M r4) {
        AnonymousClass330 A012;
        AnonymousClass330 r1 = r4.A04;
        if (r1 != null) {
            String str = r4.A07;
            if (str == null || str.length() == 0) {
                C106655Zv[] r0 = r1.A0B;
                if (r0 != null) {
                    r4.A07 = C387228w.A00(r0);
                }
            }
            r4.A0J = r1.A08;
            r4.A0H = r1.A06;
            r4.A05 = r1.A00;
            return;
        }
        String str2 = r4.A09;
        if (str2 == null || str2.length() == 0) {
            Log.w("StickerFactory/fillStickerMetadataFromFile Unable to fill metadata, file path is null or empty.");
            return;
        }
        if (r4.A04() == C369420i.LOTTIE) {
            C59962xm r02 = this.A00;
            if (str2 != null) {
                A012 = r02.A02(str2);
            } else {
                return;
            }
        } else {
            WebpUtils webpUtils = this.A01;
            C626936e.A06(str2);
            A012 = AnonymousClass330.A01(webpUtils.A05(str2));
        }
        if (A012 != null) {
            r4.A04 = A012;
            r4.A0H = A012.A06;
            r4.A0J = A012.A08;
            r4.A05 = A012.A00;
            C106655Zv[] r03 = A012.A0B;
            if (r03 != null) {
                r4.A07 = C387228w.A00(r03);
            }
        }
    }

    public final AnonymousClass330 A01(C369420i r2, String str) {
        C18260x0.A0O(str, r2);
        if (r2 == C369420i.LOTTIE) {
            return this.A00.A02(str);
        }
        return AnonymousClass330.A01(this.A01.A05(str));
    }
}
