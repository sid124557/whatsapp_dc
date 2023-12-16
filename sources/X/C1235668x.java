package X;

import android.content.DialogInterface;

/* renamed from: X.68x  reason: invalid class name and case insensitive filesystem */
public class C1235668x implements DialogInterface.OnClickListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C1235668x(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.registration.SelectPhoneNumberDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.contact.picker.PhoneNumberSelectionDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.registration.SelectPhoneNumberDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.registration.SelectPhoneNumberDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.registration.SelectPhoneNumberDialog} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: com.whatsapp.registration.SelectPhoneNumberDialog} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0066, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0161, code lost:
        r3.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0164, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005e, code lost:
        if (r5.A0N.getActivityUtils().A0D(X.C112975kg.A00(r5), X.C105975Xd.A00(r0, r1, r2, r4), 41) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0060, code lost:
        r5.A10.A03(r4, 6);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r7, int r8) {
        /*
            r6 = this;
            int r0 = r6.A03
            switch(r0) {
                case 0: goto L_0x00cd;
                case 1: goto L_0x00e2;
                case 2: goto L_0x0027;
                case 3: goto L_0x0039;
                case 4: goto L_0x0100;
                case 5: goto L_0x0067;
                case 6: goto L_0x0110;
                case 7: goto L_0x00ac;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r4 = r6.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r4 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r4
            java.lang.Object r1 = r6.A01
            X.5a1 r1 = (X.C106705a1) r1
            java.lang.Object r0 = r6.A02
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r3 = 0
            android.content.Intent r2 = X.C105975Xd.A00(r4, r0, r1, r3)
            X.5hX r1 = r4.A00
            r0 = 1
            boolean r0 = r1.A0D(r4, r2, r0)
            if (r0 == 0) goto L_0x0026
            X.5Tk r1 = r4.A0E
            r0 = 10
            r1.A03(r3, r0)
        L_0x0026:
            return
        L_0x0027:
            java.lang.Object r5 = r6.A00
            X.5kg r5 = (X.C112975kg) r5
            java.lang.Object r2 = r6.A01
            X.5a1 r2 = (X.C106705a1) r2
            java.lang.Object r1 = r6.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.4eZ r0 = X.C112975kg.A00(r5)
            r4 = 1
            goto L_0x004a
        L_0x0039:
            java.lang.Object r5 = r6.A00
            X.5kg r5 = (X.C112975kg) r5
            java.lang.Object r2 = r6.A01
            X.5a1 r2 = (X.C106705a1) r2
            java.lang.Object r1 = r6.A02
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            X.4eZ r0 = X.C112975kg.A00(r5)
            r4 = 0
        L_0x004a:
            android.content.Intent r3 = X.C105975Xd.A00(r0, r1, r2, r4)
            X.66y r0 = r5.A0N
            X.5hX r2 = r0.getActivityUtils()
            X.4eZ r1 = X.C112975kg.A00(r5)
            r0 = 41
            boolean r0 = r2.A0D(r1, r3, r0)
            if (r0 == 0) goto L_0x0026
            X.5Tk r1 = r5.A10
            r0 = 6
            r1.A03(r4, r0)
            return
        L_0x0067:
            java.lang.Object r5 = r6.A00
            com.whatsapp.documentpicker.DocumentPickerActivity$SendDocumentsConfirmationDialogFragment r5 = (com.whatsapp.documentpicker.DocumentPickerActivity.SendDocumentsConfirmationDialogFragment) r5
            java.lang.Object r4 = r6.A01
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            java.lang.Object r3 = r6.A02
            X.4uZ r3 = (X.C95814uZ) r3
            X.03q r2 = r5.A0Q()
            if (r2 == 0) goto L_0x0026
            X.2rx r1 = r5.A02
            int r0 = r4.size()
            boolean r0 = X.AnonymousClass5b1.A05(r1, r3, r0)
            if (r0 == 0) goto L_0x009f
            boolean r0 = r2 instanceof com.whatsapp.documentpicker.DocumentPickerActivity
            if (r0 == 0) goto L_0x009f
            X.03q r1 = r5.A0Q()
            com.whatsapp.documentpicker.DocumentPickerActivity r1 = (com.whatsapp.documentpicker.DocumentPickerActivity) r1
            java.lang.Object r0 = X.AnonymousClass0x9.A0t(r4)
            android.net.Uri r0 = (android.net.Uri) r0
            r1.A79(r0)
        L_0x0098:
            X.5U6 r1 = r5.A04
            r0 = 2
            r1.A03(r0)
            return
        L_0x009f:
            android.content.Intent r1 = X.C18320x8.A07()
            java.lang.String r0 = "android.intent.extra.STREAM"
            r1.putParcelableArrayListExtra(r0, r4)
            X.AnonymousClass0x2.A0m(r2, r1)
            goto L_0x0098
        L_0x00ac:
            java.lang.Object r3 = r6.A00
            com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity r3 = (com.whatsapp.viewsharedcontacts.ViewSharedContactArrayActivity) r3
            java.lang.Object r1 = r6.A01
            X.5a1 r1 = (X.C106705a1) r1
            java.lang.Object r0 = r6.A02
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            r2 = 1
            android.content.Intent r1 = X.C105975Xd.A00(r3, r0, r1, r2)
            X.5hX r0 = r3.A00
            boolean r0 = r0.A0D(r3, r1, r2)
            if (r0 == 0) goto L_0x0026
            X.5Tk r1 = r3.A0E
            r0 = 10
            r1.A03(r2, r0)
            return
        L_0x00cd:
            java.lang.Object r3 = r6.A00
            com.whatsapp.community.CommunityExitDialogFragment r3 = (com.whatsapp.community.CommunityExitDialogFragment) r3
            java.lang.Object r0 = r6.A01
            X.4VM r0 = (X.AnonymousClass4VM) r0
            java.lang.Object r2 = r6.A02
            r0.A0D()
            X.4FS r1 = r3.A08
            r0 = 28
            X.C86624Kv.A1M(r1, r3, r2, r0)
            return
        L_0x00e2:
            java.lang.Object r3 = r6.A00
            com.whatsapp.contact.picker.PhoneNumberSelectionDialog r3 = (com.whatsapp.contact.picker.PhoneNumberSelectionDialog) r3
            java.lang.Object r2 = r6.A01
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            java.lang.Object r0 = r6.A02
            X.4OJ r0 = (X.AnonymousClass4OJ) r0
            X.8nw r1 = r3.A00
            if (r1 == 0) goto L_0x0161
            int r0 = r0.A00
            java.lang.Object r0 = r2.get(r0)
            X.5dN r0 = (X.C108675dN) r0
            java.lang.String r0 = r0.A00
            r1.BXG(r0)
            goto L_0x0161
        L_0x0100:
            java.lang.Object r2 = r6.A00
            X.1QL r2 = (X.AnonymousClass1QL) r2
            java.lang.Object r1 = r6.A01
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.Object r0 = r6.A02
            android.app.DatePickerDialog$OnDateSetListener r0 = (android.app.DatePickerDialog.OnDateSetListener) r0
            X.AnonymousClass1QL.A00(r1, r0, r2, r8)
            return
        L_0x0110:
            java.lang.Object r2 = r6.A00
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r6.A01
            X.4ON r1 = (X.AnonymousClass4ON) r1
            java.lang.Object r3 = r6.A02
            com.whatsapp.registration.SelectPhoneNumberDialog r3 = (com.whatsapp.registration.SelectPhoneNumberDialog) r3
            java.lang.String r0 = "SelectPhoneNumberDialog/use-clicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r1.A00
            java.lang.Object r4 = r2.get(r0)
            X.5dO r4 = (X.C108685dO) r4
            X.8jS r2 = r3.A01
            if (r2 == 0) goto L_0x0161
            com.whatsapp.registration.RegisterPhone r2 = (com.whatsapp.registration.RegisterPhone) r2
            X.5OP r1 = r2.A0m
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A02 = r0
            java.lang.String r0 = r4.A00
            r2.A0a = r0
            java.lang.String r1 = r4.A02
            r2.A0b = r1
            X.5Kb r0 = r2.A0I
            android.widget.EditText r0 = r0.A03
            r0.setText(r1)
            X.5Kb r0 = r2.A0I
            android.widget.EditText r1 = r0.A02
            java.lang.String r0 = r2.A0a
            r1.setText(r0)
            X.5Kb r0 = r2.A0I
            android.widget.EditText r1 = r0.A03
            android.text.Editable r0 = r1.getText()
            java.lang.String r0 = X.C18270x1.A0T(r0)
            X.C626936e.A06(r0)
            X.C86654Ky.A1D(r1, r0)
        L_0x0161:
            r3.A1K()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1235668x.onClick(android.content.DialogInterface, int):void");
    }
}
