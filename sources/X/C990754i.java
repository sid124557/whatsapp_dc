package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.group.GroupChatInfoActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.54i  reason: invalid class name and case insensitive filesystem */
public class C990754i extends AnonymousClass5ZM {
    public final C613330g A00;
    public final AnonymousClass3ZH A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Context A0U = C86664Kz.A0U(this.A02);
        if (A0U != null) {
            return this.A00.A03(A0U, this.A01, 0.0f, 640, false);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A02.get();
        if (groupChatInfoActivity != null) {
            if (bitmap != null) {
                groupChatInfoActivity.A7A(bitmap);
            } else {
                groupChatInfoActivity.A7D(Integer.valueOf(groupChatInfoActivity.A0r.A01(groupChatInfoActivity.A7G(), false)));
            }
            if (AnonymousClass331.A00(groupChatInfoActivity.A7G())) {
                groupChatInfoActivity.A0A.setVisibility(0);
            }
        }
    }

    public C990754i(C613330g r2, AnonymousClass3ZH r3, GroupChatInfoActivity groupChatInfoActivity) {
        this.A00 = r2;
        this.A02 = AnonymousClass0x9.A14(groupChatInfoActivity);
        this.A01 = r3;
    }
}
