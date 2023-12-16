package X;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.0YA  reason: invalid class name */
public class AnonymousClass0YA {
    public static void A00(TextUtils.TruncateAt truncateAt, BloksEditText bloksEditText, C04080Ms r4) {
        KeyListener keyListener;
        if (r4 != null && bloksEditText.getEllipsize() != truncateAt) {
            if (truncateAt == null) {
                if (r4.A0J != bloksEditText.getKeyListener()) {
                    keyListener = r4.A0J;
                }
                r4.A0G = truncateAt;
                bloksEditText.setEllipsize(truncateAt);
            }
            r4.A0J = bloksEditText.getKeyListener();
            keyListener = null;
            bloksEditText.setKeyListener(keyListener);
            r4.A0G = truncateAt;
            bloksEditText.setEllipsize(truncateAt);
        }
    }

    public static void A02(BloksEditText bloksEditText, C04080Ms r2) {
        Drawable drawable = r2.A0C;
        if (drawable != null) {
            bloksEditText.setTextCursorDrawable(drawable);
        }
    }

    public static void A03(BloksEditText bloksEditText, C04080Ms r4, C153427bI r5, AnonymousClass84O r6) {
        Drawable.ConstantState constantState;
        if (r6 != null) {
            Drawable textCursorDrawable = bloksEditText.getTextCursorDrawable();
            r4.A0C = textCursorDrawable;
            if (textCursorDrawable != null && (constantState = textCursorDrawable.getConstantState()) != null) {
                Drawable newDrawable = constantState.newDrawable();
                AnonymousClass001.A12(PorterDuff.Mode.SRC_OVER, newDrawable, C154127ce.A00(r5, r6));
                bloksEditText.setTextCursorDrawable(newDrawable);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0042, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        if (r5.equals(r2) == false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00e2, code lost:
        r3.setImportantForAutofill(1);
        r3.setAutofillHints(new java.lang.String[]{r2});
        X.C161827qc.A02(new X.C11260jM(r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f6, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0033, code lost:
        X.C159737mN.A01("TextInputBinderUtils", X.AnonymousClass000.A0V("Unsupported value for autofill type: ", r5, X.AnonymousClass001.A0o()));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A05(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText r3, X.C153427bI r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "none"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x000d
            r0 = 2
            r3.setImportantForAutofill(r0)
            return
        L_0x000d:
            android.content.Context r1 = r4.A00()
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.autofill.AutofillManager r1 = (android.view.autofill.AutofillManager) r1
            if (r1 == 0) goto L_0x0028
            android.view.autofill.AutofillId r0 = r1.getNextAutofillId()
            r3.setAutofillId(r0)
            r1.requestAutofill(r3)
            r1.notifyViewClicked(r3)
        L_0x0028:
            int r0 = r5.hashCode()
            java.lang.String r2 = "password"
            java.lang.String r1 = "username"
            switch(r0) {
                case -2053263135: goto L_0x00d8;
                case -1677176261: goto L_0x00cd;
                case -1163041205: goto L_0x00c2;
                case -1122949358: goto L_0x00b7;
                case -612351174: goto L_0x00ac;
                case -397476730: goto L_0x00a1;
                case -265713450: goto L_0x0099;
                case -177500692: goto L_0x008e;
                case -177500691: goto L_0x0083;
                case 21980740: goto L_0x0078;
                case 96619420: goto L_0x006d;
                case 263786198: goto L_0x0062;
                case 390008550: goto L_0x0056;
                case 1216985755: goto L_0x004f;
                case 1729797393: goto L_0x0043;
                default: goto L_0x0033;
            }
        L_0x0033:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unsupported value for autofill type: "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r5, r1)
            java.lang.String r0 = "TextInputBinderUtils"
            X.C159737mN.A01(r0, r1)
            return
        L_0x0043:
            java.lang.String r0 = "credit_card_expiry_date"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "creditCardExpirationDate"
            goto L_0x00e2
        L_0x004f:
            boolean r0 = r5.equals(r2)
            if (r0 != 0) goto L_0x00e2
            goto L_0x0033
        L_0x0056:
            java.lang.String r0 = "credit_card_card_security_code"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "creditCardSecurityCode"
            goto L_0x00e2
        L_0x0062:
            java.lang.String r0 = "address_city"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "addressLocality"
            goto L_0x00e2
        L_0x006d:
            java.lang.String r0 = "email"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "emailAddress"
            goto L_0x00e2
        L_0x0078:
            java.lang.String r0 = "full_address"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "postalAddress"
            goto L_0x00e2
        L_0x0083:
            java.lang.String r0 = "address_street_line2"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "aptNumber"
            goto L_0x00e2
        L_0x008e:
            java.lang.String r0 = "address_street_line1"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "streetAddress"
            goto L_0x00e2
        L_0x0099:
            boolean r0 = r5.equals(r1)
            if (r0 == 0) goto L_0x0033
            r2 = r1
            goto L_0x00e2
        L_0x00a1:
            java.lang.String r0 = "address_state"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "addressRegion"
            goto L_0x00e2
        L_0x00ac:
            java.lang.String r0 = "phone_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "phone"
            goto L_0x00e2
        L_0x00b7:
            java.lang.String r0 = "credit_card_number"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "creditCardNumber"
            goto L_0x00e2
        L_0x00c2:
            java.lang.String r0 = "address_country"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "addressCountry"
            goto L_0x00e2
        L_0x00cd:
            java.lang.String r0 = "full_name"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "name"
            goto L_0x00e2
        L_0x00d8:
            java.lang.String r0 = "postal_code"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0033
            java.lang.String r2 = "postalCode"
        L_0x00e2:
            r0 = 1
            r3.setImportantForAutofill(r0)
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r2
            r3.setAutofillHints(r1)
            X.0jM r0 = new X.0jM
            r0.<init>(r3)
            X.C161827qc.A02(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YA.A05(com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText, X.7bI, java.lang.String):void");
    }

    public static boolean A06(int i) {
        int i2 = i & 4095;
        if (i2 == 129 || i2 == 225 || i2 == 18 || i2 == 145) {
            return true;
        }
        return false;
    }

    public static void A01(BloksEditText bloksEditText) {
        for (ViewParent parent = bloksEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                ((ViewGroup) parent).setImportantForAutofill(1);
            }
        }
    }

    public static void A04(BloksEditText bloksEditText, C153427bI r2, String str) {
        if (bloksEditText.isAttachedToWindow()) {
            return;
        }
        if (str == null) {
            bloksEditText.setAutofillHints(new String[]{null});
            bloksEditText.setImportantForAutofill(0);
            return;
        }
        A05(bloksEditText, r2, str);
    }

    public static boolean A07(BloksEditText bloksEditText) {
        Editable text = bloksEditText.getText();
        if (text == null || text.length() == 0 || bloksEditText.getWidth() == 0 || bloksEditText.getLineCount() > 1 || (bloksEditText.getInputType() & 131087) == 131073 || A06(bloksEditText.getInputType())) {
            return false;
        }
        return true;
    }
}
