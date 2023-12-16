package X;

import android.text.Editable;
import android.text.NoCopySpan;
import android.text.TextWatcher;
import com.whatsapp.biz.catalog.view.PostcodeChangeBottomSheet;
import com.whatsapp.textstatus.AddTextStatusActivity;

/* renamed from: X.6C1  reason: invalid class name */
public class AnonymousClass6C1 implements NoCopySpan, TextWatcher {
    public Object A00;
    public final int A01;

    public AnonymousClass6C1(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void afterTextChanged(Editable editable) {
        String str;
        switch (this.A01) {
            case 0:
                AnonymousClass4VN r3 = ((PostcodeChangeBottomSheet) this.A00).A09;
                r3.A02 = AnonymousClass4VN.A00(editable.toString());
                if (C162457s7.A0P(r3.A03, "cep") && (str = r3.A02) != null && str.length() > 5) {
                    StringBuilder A0A = C18330xA.A0A(str);
                    A0A.insert(5, '-');
                    r3.A02 = A0A.toString();
                }
                r3.A0E();
                return;
            case 2:
                AddTextStatusActivity addTextStatusActivity = (AddTextStatusActivity) this.A00;
                if (addTextStatusActivity.A0F) {
                    AnonymousClass4WZ r2 = addTextStatusActivity.A0C;
                    if (r2 == null) {
                        throw C18270x1.A0S("adapter");
                    }
                    r2.A01 = null;
                    r2.A05();
                    addTextStatusActivity.A0F = false;
                }
                addTextStatusActivity.A74();
                String str2 = addTextStatusActivity.A0D;
                if (str2 == null || str2.length() == 0) {
                    addTextStatusActivity.A04.BkP(new C117635sF(addTextStatusActivity, 42));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0028, code lost:
        if (r5.length() != 0) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.length() < 4) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        if (r0.A0F == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r5, int r6, int r7, int r8) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 1: goto L_0x0030;
                case 2: goto L_0x0005;
                case 3: goto L_0x0006;
                case 4: goto L_0x0011;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r0 = r4.A00
            com.whatsapp.wds.components.search.WDSConversationSearchView r0 = (com.whatsapp.wds.components.search.WDSConversationSearchView) r0
            android.widget.ImageButton r2 = r0.A03
            boolean r0 = r0.A0F
            if (r0 != 0) goto L_0x002a
            goto L_0x0021
        L_0x0011:
            java.lang.Object r2 = r4.A00
            com.whatsapp.wds.components.search.WDSSearchView r2 = (com.whatsapp.wds.components.search.WDSSearchView) r2
            X.7Et r1 = r2.A01
            X.6t3 r0 = X.C140036t3.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            if (r0 == 0) goto L_0x0005
            com.whatsapp.WaImageButton r2 = r2.A0A
        L_0x0021:
            r1 = 0
            if (r5 == 0) goto L_0x002a
            int r0 = r5.length()
            if (r0 != 0) goto L_0x002c
        L_0x002a:
            r1 = 8
        L_0x002c:
            r2.setVisibility(r1)
            return
        L_0x0030:
            java.lang.Object r0 = r4.A00
            com.whatsapp.registration.RegisterEmail r0 = (com.whatsapp.registration.RegisterEmail) r0
            com.whatsapp.wds.components.button.WDSButton r3 = r0.A0A
            if (r3 != 0) goto L_0x003f
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x003f:
            if (r5 == 0) goto L_0x0049
            int r2 = r5.length()
            r1 = 4
            r0 = 1
            if (r2 >= r1) goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r3.setEnabled(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6C1.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
