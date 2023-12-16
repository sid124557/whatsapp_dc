package X;

import androidx.fragment.app.DialogFragment;
import com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog;

/* renamed from: X.27G  reason: invalid class name */
public class AnonymousClass27G extends AnonymousClass8V2 implements AnonymousClass4GP {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass27G(java.lang.Object r8, int r9) {
        /*
            r7 = this;
            r0 = r7
            r7.A00 = r9
            switch(r9) {
                case 0: goto L_0x0015;
                case 1: goto L_0x001c;
                case 2: goto L_0x0023;
                case 3: goto L_0x0023;
                case 4: goto L_0x0023;
                case 5: goto L_0x0023;
                case 6: goto L_0x0023;
                case 7: goto L_0x0023;
                case 8: goto L_0x002a;
                case 9: goto L_0x0031;
                case 10: goto L_0x0038;
                default: goto L_0x0006;
            }
        L_0x0006:
            java.lang.Class<com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog> r3 = com.whatsapp.status.archive.StatusArchiveSettingsBottomSheetDialog.class
            java.lang.String r4 = "onDoneClick"
            java.lang.String r5 = "onDoneClick()V"
        L_0x000e:
            r1 = 0
            r2 = r8
            r6 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        L_0x0015:
            java.lang.Class<com.whatsapp.community.CommunityAddMembersBottomSheet> r3 = com.whatsapp.community.CommunityAddMembersBottomSheet.class
            java.lang.String r4 = "dismiss"
            java.lang.String r5 = "dismiss()V"
            goto L_0x000e
        L_0x001c:
            java.lang.Class<X.2xM> r3 = X.C59712xM.class
            java.lang.String r4 = "clearSelectedRows"
            java.lang.String r5 = "clearSelectedRows()V"
            goto L_0x000e
        L_0x0023:
            java.lang.Class<X.8qC> r3 = X.C183538qC.class
            java.lang.String r4 = "get"
            java.lang.String r5 = "get()Ljava/lang/Object;"
            goto L_0x000e
        L_0x002a:
            java.lang.Class<X.2On> r3 = X.C42532On.class
            java.lang.String r4 = "getUserPhone"
            java.lang.String r5 = "getUserPhone()Ljava/lang/String;"
            goto L_0x000e
        L_0x0031:
            java.lang.Class<X.2On> r3 = X.C42532On.class
            java.lang.String r4 = "getPushName"
            java.lang.String r5 = "getPushName()Ljava/lang/String;"
            goto L_0x000e
        L_0x0038:
            java.lang.Class<com.whatsapp.status.archive.StatusArchiveSettingsViewModel> r3 = com.whatsapp.status.archive.StatusArchiveSettingsViewModel.class
            java.lang.String r4 = "onUpdateLayoutClicked"
            java.lang.String r5 = "onUpdateLayoutClicked()V"
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass27G.<init>(java.lang.Object, int):void");
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String A03;
        switch (this.A00) {
            case 0:
                ((DialogFragment) this.receiver).A1K();
                break;
            case 1:
                C59712xM.A00((C59712xM) this.receiver);
                break;
            case 8:
                AnonymousClass1RR A01 = C56972sr.A01(((C42532On) this.receiver).A00);
                if (A01 == null || (A03 = AnonymousClass36P.A03(AnonymousClass3ZH.A01(A01))) == null) {
                    return "";
                }
                return A03;
            case 9:
                String A032 = ((C42532On) this.receiver).A00.A0D.A03();
                C162457s7.A0D(A032);
                return A032;
            case 10:
                throw AnonymousClass001.A0g("getValue");
            case 11:
                StatusArchiveSettingsBottomSheetDialog statusArchiveSettingsBottomSheetDialog = (StatusArchiveSettingsBottomSheetDialog) this.receiver;
                statusArchiveSettingsBottomSheetDialog.A1Y(2);
                statusArchiveSettingsBottomSheetDialog.A03.getValue();
                throw AnonymousClass001.A0g("getValue");
            default:
                return ((C183538qC) this.receiver).get();
        }
        return C59022wD.A00;
    }
}
