package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Pair;
import com.whatsapp.R;
import com.whatsapp.invites.InviteGroupParticipantsActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.1sy  reason: invalid class name and case insensitive filesystem */
public class C33421sy extends AnonymousClass5ZM {
    public final C613330g A00;
    public final AnonymousClass3ZH A01;
    public final WeakReference A02;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Bitmap bitmap;
        Context context = (Context) this.A02.get();
        byte[] bArr = null;
        if (context != null) {
            bitmap = this.A00.A03(context, this.A01, 0.0f, 96, false);
            if (bitmap != null) {
                bArr = C18320x8.A1Y(bitmap, AnonymousClass0x9.A0e());
            }
        } else {
            bitmap = null;
        }
        return AnonymousClass0x9.A0C(bitmap, bArr);
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Pair pair = (Pair) obj;
        Bitmap bitmap = (Bitmap) pair.first;
        byte[] bArr = (byte[]) pair.second;
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = (InviteGroupParticipantsActivity) this.A02.get();
        if (inviteGroupParticipantsActivity != null) {
            inviteGroupParticipantsActivity.A0E = bArr;
            if (bitmap == null) {
                inviteGroupParticipantsActivity.A00.setImageResource(R.drawable.avatar_group);
            } else {
                inviteGroupParticipantsActivity.A00.setImageBitmap(bitmap);
            }
        }
    }

    public C33421sy(C613330g r2, AnonymousClass3ZH r3, InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A00 = r2;
        this.A02 = AnonymousClass0x9.A14(inviteGroupParticipantsActivity);
        this.A01 = r3;
    }
}
