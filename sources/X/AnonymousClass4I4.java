package X;

import android.content.DialogInterface;

/* renamed from: X.4I4  reason: invalid class name */
public class AnonymousClass4I4 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass4I4(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment} */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010e, code lost:
        r0 = r3.A1D();
        r3 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        r1.A0A(r0, r2);
        r3.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        r8.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0118, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0054;
                case 1: goto L_0x0067;
                case 2: goto L_0x0078;
                case 3: goto L_0x0014;
                case 4: goto L_0x009e;
                case 5: goto L_0x00e0;
                case 6: goto L_0x003c;
                case 7: goto L_0x0048;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A01
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r7.A00
            X.4EE r0 = r0.A01
            r0.BR8(r1)
        L_0x0010:
            r8.dismiss()
        L_0x0013:
            return
        L_0x0014:
            java.lang.Object r0 = r7.A01
            com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog r0 = (com.whatsapp.community.CommunityPendingSuggestionsConfirmationDialog) r0
            int r1 = r7.A00
            X.47z r0 = r0.A00
            if (r0 != 0) goto L_0x0025
            java.lang.String r0 = "approveClickListener"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0025:
            com.whatsapp.community.CommunitySettingsActivity r0 = (com.whatsapp.community.CommunitySettingsActivity) r0
            X.66R r0 = r0.A0N
            java.lang.Object r6 = r0.getValue()
            com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel r6 = (com.whatsapp.community.communitysettings.viewmodel.CommunitySettingsViewModel) r6
            X.1fJ r2 = r6.A03
            if (r2 == 0) goto L_0x0013
            r5 = 1
            if (r1 == 0) goto L_0x0119
            if (r1 == r5) goto L_0x0150
            r0 = 2
            if (r1 == r0) goto L_0x0150
            return
        L_0x003c:
            java.lang.Object r0 = r7.A01
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r7.A00
            X.4EE r0 = r0.A01
            r0.BR9(r1)
            goto L_0x0010
        L_0x0048:
            java.lang.Object r0 = r7.A01
            com.whatsapp.dialogs.PromptDialogFragment r0 = (com.whatsapp.dialogs.PromptDialogFragment) r0
            int r1 = r7.A00
            X.4EE r0 = r0.A01
            r0.BRA(r1)
            goto L_0x0010
        L_0x0054:
            java.lang.Object r2 = r7.A01
            X.1qJ r2 = (X.C32381qJ) r2
            int r1 = r7.A00
            android.app.Activity r0 = r2.A01
            X.C621433s.A00(r0, r1)
            r1 = 1
            r2.A00 = r1
            r0 = 0
            r2.BkT(r1, r0)
            return
        L_0x0067:
            java.lang.Object r1 = r7.A01
            X.1qJ r1 = (X.C32381qJ) r1
            int r0 = r7.A00
            android.app.Activity r1 = r1.A01
            X.C621433s.A00(r1, r0)
            r0 = 106(0x6a, float:1.49E-43)
            X.C621433s.A01(r1, r0)
            return
        L_0x0078:
            java.lang.Object r3 = r7.A01
            com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment r3 = (com.whatsapp.chatinfo.fragment.EncryptionExplanationDialogFragment) r3
            int r1 = r7.A00
            r0 = 1
            X.3Lk r2 = r3.A05
            if (r1 != r0) goto L_0x0094
            java.lang.String r0 = "28030015"
            android.net.Uri r0 = X.C66433Lk.A00(r2, r0)
        L_0x0089:
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            X.5hX r1 = r3.A00
            android.content.Context r0 = r3.A0G()
            goto L_0x0112
        L_0x0094:
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A04(r1, r0)
            goto L_0x0089
        L_0x009e:
            java.lang.Object r3 = r7.A01
            com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment r3 = (com.whatsapp.conversation.conversationrow.BusinessTransitionInfoDialogFragment) r3
            int r4 = r7.A00
            X.1Yz r1 = r3.A05
            r2 = 2
            if (r1 == 0) goto L_0x00b4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A01 = r0
            X.4FV r0 = r3.A04
            r0.BhD(r1)
        L_0x00b4:
            r0 = 30
            if (r4 != r0) goto L_0x00ce
            X.1Y2 r1 = new X.1Y2
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A00 = r0
            java.lang.Integer r0 = X.C18320x8.A0W()
            r1.A01 = r0
            X.4FV r0 = r3.A04
            r0.BhD(r1)
        L_0x00ce:
            X.3Lk r2 = r3.A06
            java.lang.String r1 = "security-and-privacy"
            java.lang.String r0 = "end-to-end-encryption-for-business-messages"
            android.net.Uri r0 = r2.A04(r1, r0)
            android.content.Intent r2 = X.C18310x6.A0D(r0)
            X.5hX r1 = r3.A00
            goto L_0x010e
        L_0x00e0:
            java.lang.Object r3 = r7.A01
            com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment r3 = (com.whatsapp.conversation.conversationrow.VerifiedBusinessInfoDialogFragment) r3
            int r4 = r7.A00
            X.3Lk r1 = r3.A03
            java.lang.String r0 = "643460927283235"
            android.net.Uri r2 = X.C66433Lk.A00(r1, r0)
            r0 = 46
            if (r4 != r0) goto L_0x0108
            X.1Y2 r1 = new X.1Y2
            r1.<init>()
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A00 = r0
            java.lang.Integer r0 = X.C18320x8.A0W()
            r1.A01 = r0
            X.4FV r0 = r3.A02
            r0.BhD(r1)
        L_0x0108:
            android.content.Intent r2 = X.C18310x6.A0D(r2)
            X.5hX r1 = r3.A00
        L_0x010e:
            android.content.Context r0 = r3.A1D()
        L_0x0112:
            r1.A0A(r0, r2)
            r3.A1K()
            return
        L_0x0119:
            X.2so r1 = r6.A06
            X.2rM r0 = r1.A0H
            java.util.Set r0 = r0.A03(r2)
            int r4 = r0.size()
            X.1VX r2 = r1.A0F
            r1 = 1238(0x4d6, float:1.735E-42)
            X.2vE r0 = X.C58422vE.A02
            int r0 = r2.A0O(r0, r1)
            int r3 = r0 + 1
            int r3 = r3 - r4
            if (r3 > 0) goto L_0x0141
            X.107 r3 = r6.A0G
            r2 = 2
            r1 = 0
            X.2lB r0 = new X.2lB
            r0.<init>(r2, r1, r1)
            r3.A0G(r0)
            return
        L_0x0141:
            int r2 = r6.A00
            if (r3 >= r2) goto L_0x0150
            X.107 r1 = r6.A0G
            X.2lB r0 = new X.2lB
            r0.<init>(r5, r3, r2)
            r1.A0G(r0)
            return
        L_0x0150:
            r6.A0D(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4I4.onClick(android.content.DialogInterface, int):void");
    }
}
