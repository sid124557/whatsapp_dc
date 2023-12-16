package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.whatsapp.blockui.BlockConfirmationDialogFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5cK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108045cK implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ CheckBox A02;
    public final /* synthetic */ C89654ea A03;
    public final /* synthetic */ BlockConfirmationDialogFragment A04;
    public final /* synthetic */ AnonymousClass3ZH A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A04;
        CheckBox checkBox = this.A02;
        AnonymousClass3ZH r15 = this.A05;
        C89654ea r9 = this.A03;
        int i2 = this.A00;
        boolean z = this.A06;
        boolean z2 = this.A07;
        int i3 = this.A01;
        if (checkBox == null || !checkBox.isChecked()) {
            C49562gj r2 = blockConfirmationDialogFragment.A06;
            String str = blockConfirmationDialogFragment.A0A;
            UserJid userJid = blockConfirmationDialogFragment.A08;
            boolean A1Y = AnonymousClass0x2.A1Y(str, userJid);
            r2.A00(userJid, str, A1Y ? 1 : 0);
            C103755Oh r22 = blockConfirmationDialogFragment.A01;
            String str2 = blockConfirmationDialogFragment.A0A;
            if (z) {
                C89654ea r10 = r9;
                AnonymousClass0x7.A1B(new C33901ts(r9, r10, r22.A01, new C1234568m(r9, r22, i3, 0), (AnonymousClass20K) null, r22.A04, r15, (Integer) null, (String) null, (String) null, str2, false, false, A1Y), r22.A07);
                return;
            }
            C56962sq r102 = r22.A02;
            C1234568m r0 = new C1234568m(r9, r22, i3, A1Y);
            C86614Ku.A1S(r9, 0, str2);
            r102.A0B(r9, r0, (AnonymousClass20K) null, r15, (Integer) null, (String) null, (String) null, str2, A1Y, z2);
            return;
        }
        C49562gj r3 = blockConfirmationDialogFragment.A06;
        String str3 = blockConfirmationDialogFragment.A0A;
        UserJid userJid2 = blockConfirmationDialogFragment.A08;
        C18260x0.A0O(str3, userJid2);
        r3.A00(userJid2, str3, 3);
        C103755Oh r8 = blockConfirmationDialogFragment.A01;
        String str4 = blockConfirmationDialogFragment.A0A;
        AnonymousClass64R r23 = blockConfirmationDialogFragment.A00;
        if (r8.A04.A05(r9)) {
            r8.A00.A0M((AnonymousClass4FU) null);
            if (r23 != null) {
                r23.Bjd();
            }
            r8.A07.BkM(new C117675sJ(r8, r9, r15, str4, i2, 0));
        }
    }

    public /* synthetic */ C108045cK(CheckBox checkBox, C89654ea r2, BlockConfirmationDialogFragment blockConfirmationDialogFragment, AnonymousClass3ZH r4, int i, int i2, boolean z, boolean z2) {
        this.A04 = blockConfirmationDialogFragment;
        this.A02 = checkBox;
        this.A05 = r4;
        this.A03 = r2;
        this.A00 = i;
        this.A06 = z;
        this.A07 = z2;
        this.A01 = i2;
    }
}
