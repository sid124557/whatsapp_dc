package X;

/* renamed from: X.92f  reason: invalid class name and case insensitive filesystem */
public class C1896792f implements C834048g, AnonymousClass4GP {
    public Object A00;
    public final int A01;

    public C1896792f(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0086, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ce, code lost:
        return X.C59022wD.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r3 = this;
            int r0 = r3.A01
            switch(r0) {
                case 2: goto L_0x00c5;
                case 3: goto L_0x00b6;
                case 4: goto L_0x00a8;
                case 5: goto L_0x00a0;
                case 6: goto L_0x0094;
                case 7: goto L_0x008a;
                case 8: goto L_0x007b;
                case 9: goto L_0x006f;
                case 10: goto L_0x0067;
                case 11: goto L_0x005e;
                case 12: goto L_0x0056;
                case 13: goto L_0x0035;
                case 14: goto L_0x001f;
                case 15: goto L_0x000b;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = -1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
        L_0x000b:
            java.lang.Object r1 = r3.A00
            X.563 r1 = (X.AnonymousClass563) r1
            r1.A0D()
            boolean r0 = r1.A0N
            if (r0 != 0) goto L_0x00cc
            android.view.ViewGroup r1 = r1.A0c
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x00cc
        L_0x001f:
            java.lang.Object r2 = r3.A00
            com.whatsapp.search.SearchViewModel r2 = (com.whatsapp.search.SearchViewModel) r2
            java.util.List r0 = r2.A0K
            int r1 = r0.size()
            java.util.List r0 = r2.A0M
            int r0 = r0.size()
            int r1 = r1 + r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            return r0
        L_0x0035:
            java.lang.Object r0 = r3.A00
            X.3cG r0 = (X.C71533cG) r0
            java.lang.Object r0 = r0.A00
            X.03q r0 = (X.C003203q) r0
            X.0df r1 = r0.getSupportFragmentManager()
            java.lang.String r0 = "media_quality_fragment"
            X.0eF r1 = r1.A0D(r0)
            boolean r0 = r1 instanceof com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment
            if (r0 == 0) goto L_0x00cc
            com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment r1 = (com.whatsapp.mediacomposer.bottomsheet.MediaQualitySettingsBottomSheetFragment) r1
            android.widget.RadioButton r1 = r1.A01
            if (r1 == 0) goto L_0x00cc
            r0 = 1
            r1.setChecked(r0)
            goto L_0x00cc
        L_0x0056:
            java.lang.Object r0 = r3.A00
            X.5l7 r0 = (X.C113245l7) r0
            r0.A0y()
            goto L_0x00cc
        L_0x005e:
            java.lang.Object r1 = r3.A00
            X.5l7 r1 = (X.C113245l7) r1
            r0 = 0
            r1.A2O(r0)
            goto L_0x00cc
        L_0x0067:
            java.lang.Object r0 = r3.A00
            X.5l7 r0 = (X.C113245l7) r0
            r0.A1I()
            goto L_0x00cc
        L_0x006f:
            java.lang.Object r1 = r3.A00
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1.A3R
            if (r0 == 0) goto L_0x00c3
            X.2on r1 = r1.A2L
            r0 = 2
            goto L_0x0086
        L_0x007b:
            java.lang.Object r1 = r3.A00
            com.whatsapp.contact.picker.ContactPickerFragment r1 = (com.whatsapp.contact.picker.ContactPickerFragment) r1
            boolean r0 = r1.A3R
            if (r0 == 0) goto L_0x00c3
            X.2on r1 = r1.A2L
            r0 = 1
        L_0x0086:
            r1.A02(r0)
            goto L_0x00c3
        L_0x008a:
            java.lang.Object r0 = r3.A00
            X.5jZ r0 = (X.C112335jZ) r0
            X.5jc r0 = r0.A06
            r0.A00()
            goto L_0x00c3
        L_0x0094:
            java.lang.Object r0 = r3.A00
            X.5jZ r0 = (X.C112335jZ) r0
            X.5jc r0 = r0.A06
            X.5U8 r0 = r0.A02
            r0.A02()
            goto L_0x00c3
        L_0x00a0:
            java.lang.Object r0 = r3.A00
            com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel r0 = (com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryContextualSearchViewModel) r0
            r0.BOe()
            goto L_0x00cc
        L_0x00a8:
            java.lang.Object r2 = r3.A00
            X.5jX r2 = (X.C112315jX) r2
            X.7Ph r1 = r2.A09
            r0 = 10
            r1.A02 = r0
            r2.A06()
            goto L_0x00cc
        L_0x00b6:
            java.lang.Object r2 = r3.A00
            X.5jW r2 = (X.C112305jW) r2
            X.5LW r1 = r2.A0B
            r0 = 12
            r1.A03 = r0
            r2.A06()
        L_0x00c3:
            r0 = 0
            return r0
        L_0x00c5:
            java.lang.Object r0 = r3.A00
            X.8rV r0 = (X.C184258rV) r0
            r0.BWm()
        L_0x00cc:
            X.2wD r0 = X.C59022wD.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1896792f.invoke():java.lang.Object");
    }
}
