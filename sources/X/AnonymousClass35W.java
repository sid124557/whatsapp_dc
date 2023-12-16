package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.qrcode.contactqr.ContactQrContactCardView;

/* renamed from: X.35W  reason: invalid class name */
public class AnonymousClass35W {
    public static Integer A01(C55502qS r2) {
        int i;
        if (r2 != null) {
            if (r2.A03()) {
                i = 2;
            } else if (r2.A02()) {
                i = 3;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public static Bitmap A00(C89654ea r3, AnonymousClass3ZH r4, String str, String str2, boolean z) {
        C58732vj r2 = new C58732vj(r4, str2, str, z);
        Resources resources = r3.getResources();
        r3.A5e();
        ContactQrContactCardView contactQrContactCardView = new ContactQrContactCardView(C107405bG.A01(r3));
        contactQrContactCardView.setGravity(17);
        contactQrContactCardView.setStyle(1);
        contactQrContactCardView.A02(r2.A00, r2.A03);
        contactQrContactCardView.setPrompt(r2.A02);
        contactQrContactCardView.setQrCode(r2.A01);
        contactQrContactCardView.measure(View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.f6nameremoved), 1073741824), View.MeasureSpec.makeMeasureSpec(resources.getDimensionPixelSize(R.dimen.f6nameremoved), 1073741824));
        contactQrContactCardView.layout(0, 0, contactQrContactCardView.getMeasuredWidth(), contactQrContactCardView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(contactQrContactCardView.getWidth(), contactQrContactCardView.getHeight(), Bitmap.Config.ARGB_8888);
        contactQrContactCardView.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static String A02(String str, int i) {
        if (i == 0) {
            return str.substring(17);
        }
        if (i == 2 || i == 3) {
            String lastPathSegment = Uri.parse(str).getLastPathSegment();
            if (lastPathSegment != null) {
                return lastPathSegment;
            }
        } else {
            C18260x0.A0x("ContactQrUtils/getUniqueIdFromContactQrCode/invalid code type", AnonymousClass001.A0o(), i);
        }
        return "";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
        if (r1 != 2) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006c, code lost:
        if (r7 != null) goto L_0x006e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0074, code lost:
        if ((!r7.A00()) != false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C55502qS r6, X.AnonymousClass304 r7, X.AnonymousClass4FV r8, X.C43242Ri r9, java.lang.Boolean r10, java.lang.Integer r11, int r12, boolean r13) {
        /*
            if (r11 != 0) goto L_0x000d
            if (r7 == 0) goto L_0x0055
            int r0 = r7.A00
            if (r0 != 0) goto L_0x0055
            r0 = 3
        L_0x0009:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
        L_0x000d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            if (r9 == 0) goto L_0x001f
            int r1 = r9.A01
            r2 = 1
            if (r1 == 0) goto L_0x0020
            r0 = 1
            r2 = 3
            if (r1 == r0) goto L_0x0020
            r2 = 2
            if (r1 == r2) goto L_0x0020
        L_0x001f:
            r2 = 7
        L_0x0020:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            java.lang.Integer r3 = A01(r6)
            boolean r0 = X.AnonymousClass000.A1X(r11)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)
            X.1aG r1 = new X.1aG
            r1.<init>()
            r1.A03 = r5
            r1.A04 = r11
            r1.A05 = r4
            r1.A01 = r2
            r1.A00 = r10
            r1.A02 = r3
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0051
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A06 = r0
        L_0x0051:
            r8.BhB(r1)
            return
        L_0x0055:
            if (r9 == 0) goto L_0x006c
            int r0 = r9.A00
            if (r0 != 0) goto L_0x0076
            if (r7 == 0) goto L_0x0078
            boolean r0 = r7.A00()
            if (r0 == 0) goto L_0x006e
            int r1 = r9.A01
            if (r1 == 0) goto L_0x006e
            r0 = 2
            if (r1 == r0) goto L_0x006e
            r0 = 4
            goto L_0x0009
        L_0x006c:
            if (r7 == 0) goto L_0x0078
        L_0x006e:
            boolean r0 = r7.A00()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0078
        L_0x0076:
            r0 = 2
            goto L_0x0009
        L_0x0078:
            r11 = 0
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35W.A03(X.2qS, X.304, X.4FV, X.2Ri, java.lang.Boolean, java.lang.Integer, int, boolean):void");
    }

    public static boolean A04(String str) {
        String queryParameter;
        if (TextUtils.isEmpty(str) || (queryParameter = Uri.parse(str).getQueryParameter("src")) == null || !queryParameter.equals("qr")) {
            return false;
        }
        return true;
    }
}
