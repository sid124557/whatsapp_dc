package X;

import com.whatsapp.calling.psa.view.GroupCallPsaActivity;
import com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel;

/* renamed from: X.4Jy  reason: invalid class name and case insensitive filesystem */
public class C86394Jy implements AnonymousClass4C4, AnonymousClass4C9 {
    public Object A00;
    public final int A01;

    public C86394Jy(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if ((r7 instanceof X.AnonymousClass1ND) != false) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object B2K(java.lang.Object r7, X.C84814Du r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            if (r0 == 0) goto L_0x0013
            java.util.Map r7 = (java.util.Map) r7
            java.lang.Object r0 = r6.A00
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = (com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel) r0
            java.lang.Object r0 = r0.A0F(r7, r8)
            java.lang.Object r0 = X.AnonymousClass218.A00(r0)
            return r0
        L_0x0013:
            java.lang.Object r5 = r6.A00
            com.whatsapp.calling.psa.view.GroupCallPsaActivity r5 = (com.whatsapp.calling.psa.view.GroupCallPsaActivity) r5
            boolean r0 = r7 instanceof X.AnonymousClass1NC
            if (r0 == 0) goto L_0x003f
            X.1VX r2 = r5.A0D
            r1 = 5710(0x164e, float:8.001E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0043
            com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet r2 = new com.whatsapp.calling.psa.view.GroupCallPsaBottomSheet
            r2.<init>()
            X.3t1 r0 = new X.3t1
            r0.<init>(r5)
            r2.A03 = r0
            X.0df r1 = r5.getSupportFragmentManager()
            java.lang.String r0 = "GroupCallPsaBottomSheet"
            r2.A1O(r1, r0)
        L_0x003c:
            X.2wD r0 = X.C59022wD.A00
            return r0
        L_0x003f:
            boolean r0 = r7 instanceof X.AnonymousClass1ND
            if (r0 == 0) goto L_0x003c
        L_0x0043:
            r4 = 48
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.calling.callhistory.group.GroupCallParticipantPicker"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "hidden_jids"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "call_from_ui"
            r1.putExtra(r0, r4)
            r5.startActivity(r1)
            r5.finish()
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86394Jy.B2K(java.lang.Object, X.4Du):java.lang.Object");
    }

    public final C834048g B7u() {
        if (this.A01 != 0) {
            return new AnonymousClass8V2(2, this.A00, MemberSuggestedGroupsManagementViewModel.class, "onLoadingStates", "onLoadingStates(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }
        return new C72573dw(GroupCallPsaActivity.class, this.A00, "handleSuggestionResult", "handleSuggestionResult(Lcom/whatsapp/calling/psa/viewmodel/SuggestionResult;)V");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass4C9) || !(obj instanceof AnonymousClass4C4)) {
            return false;
        }
        return C162457s7.A0P(B7u(), ((AnonymousClass4C4) obj).B7u());
    }

    public final int hashCode() {
        return B7u().hashCode();
    }
}
