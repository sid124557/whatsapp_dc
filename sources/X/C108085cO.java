package X;

import android.content.DialogInterface;
import com.whatsapp.conversationslist.ConversationsFragment;

/* renamed from: X.5cO  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108085cO implements DialogInterface.OnClickListener {
    public final /* synthetic */ C08270df A00;
    public final /* synthetic */ C15910sA A01;
    public final /* synthetic */ AnonymousClass4FU A02;
    public final /* synthetic */ C56942so A03;
    public final /* synthetic */ C55562qY A04;
    public final /* synthetic */ AnonymousClass3ZH A05;
    public final /* synthetic */ C27991fJ A06;
    public final /* synthetic */ AnonymousClass4FS A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        AnonymousClass4FU r6 = this.A02;
        AnonymousClass4FS r10 = this.A07;
        C15910sA r5 = this.A01;
        C55562qY r8 = this.A04;
        C56942so r7 = this.A03;
        C27991fJ r9 = this.A06;
        AnonymousClass3ZH r0 = this.A05;
        C08270df r4 = this.A00;
        AnonymousClass5Ai.A00(r5, r6, r7, r8, r9, r10);
        ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = new ConversationsFragment.DeleteGroupDialogFragment();
        C106565Zm.A01(deleteGroupDialogFragment, r0);
        deleteGroupDialogFragment.A0H().putBoolean("chatContainsStarredMessages", false);
        deleteGroupDialogFragment.A1O(r4, (String) null);
    }

    public /* synthetic */ C108085cO(C08270df r1, C15910sA r2, AnonymousClass4FU r3, C56942so r4, C55562qY r5, AnonymousClass3ZH r6, C27991fJ r7, AnonymousClass4FS r8) {
        this.A02 = r3;
        this.A07 = r8;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
    }
}
