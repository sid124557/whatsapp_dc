package X;

import android.os.SystemClock;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68s  reason: invalid class name and case insensitive filesystem */
public class C1235168s implements AnonymousClass66K {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1235168s(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void BWt() {
        ((DialogFragment) this.A00).A1K();
    }

    public void BYT(boolean z) {
        C89654ea r3;
        AnonymousClass3ZH r2;
        AnonymousClass4FS r1;
        C621033m r4;
        C97154xi r7;
        AnonymousClass33p r5;
        C28891hw r6;
        boolean z2 = z;
        switch (this.A02) {
            case 0:
                Log.i("conversations/bulk-delete");
                ConversationsFragment.BulkDeleteConversationDialogFragment bulkDeleteConversationDialogFragment = (ConversationsFragment.BulkDeleteConversationDialogFragment) this.A00;
                bulkDeleteConversationDialogFragment.A1K();
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator A0q = C18320x8.A0q(this.A01);
                while (A0q.hasNext()) {
                    C86614Ku.A1P(bulkDeleteConversationDialogFragment.A01, C18300x5.A0P(A0q), A0s);
                }
                C89654ea r14 = (C89654ea) C86654Ky.A0O(bulkDeleteConversationDialogFragment);
                AnonymousClass4FS r42 = bulkDeleteConversationDialogFragment.A07;
                C621033m r15 = bulkDeleteConversationDialogFragment.A00;
                C97154xi r32 = bulkDeleteConversationDialogFragment.A05;
                AnonymousClass33p r22 = bulkDeleteConversationDialogFragment.A03;
                C28891hw r12 = bulkDeleteConversationDialogFragment.A04;
                r14.Bp9(R.string.f11nameremoved);
                AnonymousClass33p r16 = r22;
                C28891hw r17 = r12;
                C97154xi r18 = r32;
                r42.BkL(new AnonymousClass55E(r14, r15, r16, r17, r18, AnonymousClass0x9.A14(r14), A0s, SystemClock.elapsedRealtime(), z2), AnonymousClass4L0.A0U());
                return;
            case 1:
                Log.i("conversations/delete-list");
                ConversationsFragment.DeleteBroadcastListDialogFragment deleteBroadcastListDialogFragment = (ConversationsFragment.DeleteBroadcastListDialogFragment) this.A00;
                deleteBroadcastListDialogFragment.A1K();
                r3 = (C89654ea) deleteBroadcastListDialogFragment.A0Q();
                r2 = (AnonymousClass3ZH) this.A01;
                r1 = deleteBroadcastListDialogFragment.A08;
                r4 = deleteBroadcastListDialogFragment.A00;
                r7 = deleteBroadcastListDialogFragment.A06;
                r5 = deleteBroadcastListDialogFragment.A04;
                r6 = deleteBroadcastListDialogFragment.A05;
                break;
            case 2:
                Log.i("conversations/delete-contact");
                ConversationsFragment.DeleteContactDialogFragment deleteContactDialogFragment = (ConversationsFragment.DeleteContactDialogFragment) this.A00;
                deleteContactDialogFragment.A1L();
                r3 = (C89654ea) deleteContactDialogFragment.A0Q();
                r2 = (AnonymousClass3ZH) this.A01;
                r1 = deleteContactDialogFragment.A08;
                r4 = deleteContactDialogFragment.A00;
                r7 = deleteContactDialogFragment.A06;
                r5 = deleteContactDialogFragment.A04;
                r6 = deleteContactDialogFragment.A05;
                break;
            default:
                Log.i("conversations/user-deleteGroup");
                ConversationsFragment.DeleteGroupDialogFragment deleteGroupDialogFragment = (ConversationsFragment.DeleteGroupDialogFragment) this.A00;
                deleteGroupDialogFragment.A1K();
                r3 = (C89654ea) deleteGroupDialogFragment.A0Q();
                r2 = (AnonymousClass3ZH) this.A01;
                r1 = deleteGroupDialogFragment.A09;
                r4 = deleteGroupDialogFragment.A00;
                r7 = deleteGroupDialogFragment.A07;
                r5 = deleteGroupDialogFragment.A04;
                r6 = deleteGroupDialogFragment.A05;
                break;
        }
        List singletonList = Collections.singletonList(r2);
        r3.Bp9(R.string.f11nameremoved);
        r1.BkL(new AnonymousClass55E(r3, r4, r5, r6, r7, AnonymousClass0x9.A14(r3), singletonList, SystemClock.elapsedRealtime(), z2), AnonymousClass4L0.A0U());
    }
}
