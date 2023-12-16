package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity;
import java.util.List;

/* renamed from: X.947  reason: invalid class name */
public class AnonymousClass947 extends ArrayAdapter {
    public List A00;
    public final LayoutInflater A01;
    public final /* synthetic */ PaymentGroupParticipantPickerActivity A02;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0111 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0176  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            r9 = this;
            r2 = 0
            r5 = 0
            if (r11 != 0) goto L_0x016e
            android.view.LayoutInflater r1 = r9.A01
            r0 = 2131625032(0x7f0e0448, float:1.887726E38)
            android.view.View r11 = r1.inflate(r0, r12, r5)
            X.9Pf r0 = new X.9Pf
            r0.<init>()
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r1 = r9.A02
            X.64J r3 = r1.A01
            r1 = 2131431647(0x7f0b10df, float:1.848503E38)
            X.5YB r1 = X.AnonymousClass5YB.A00(r11, r3, r1)
            r0.A03 = r1
            r1 = 2131427806(0x7f0b01de, float:1.8477239E38)
            android.widget.ImageView r1 = X.AnonymousClass0x9.A0F(r11, r1)
            r0.A00 = r1
            r1 = 2131433381(0x7f0b17a5, float:1.8488546E38)
            android.view.View r1 = r11.findViewById(r1)
            com.whatsapp.TextEmojiLabel r1 = (com.whatsapp.TextEmojiLabel) r1
            r0.A02 = r1
            r1 = 2131433880(0x7f0b1998, float:1.8489558E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r11, r1)
            r0.A01 = r1
            r11.setTag(r0)
        L_0x003f:
            X.5YB r1 = r0.A03
            com.whatsapp.TextEmojiLabel r1 = r1.A02
            r1.setText(r2)
            X.5YB r6 = r0.A03
            android.content.Context r4 = r9.getContext()
            android.content.Context r3 = r9.getContext()
            r2 = 2130969995(0x7f04058b, float:1.7548688E38)
            r1 = 2131101335(0x7f060697, float:1.7815077E38)
            int r1 = X.AnonymousClass5Yj.A02(r3, r2, r1)
            int r2 = X.AnonymousClass0Y8.A04(r4, r1)
            com.whatsapp.TextEmojiLabel r1 = r6.A02
            r1.setTextColor(r2)
            X.5YB r1 = r0.A03
            r2 = 1065353216(0x3f800000, float:1.0)
            com.whatsapp.TextEmojiLabel r1 = r1.A02
            r1.setAlpha(r2)
            com.whatsapp.TextEmojiLabel r1 = r0.A02
            r2 = 8
            r1.setVisibility(r2)
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r2)
            android.widget.TextView r2 = r0.A01
            r1 = 2131891658(0x7f1215ca, float:1.9418042E38)
            r2.setText(r1)
            java.util.List r1 = r9.A00
            java.lang.Object r3 = r1.get(r10)
            X.9ON r3 = (X.AnonymousClass9ON) r3
            X.C626936e.A06(r3)
            X.3ZH r7 = r3.A00
            r0.A04 = r3
            X.5YB r1 = r0.A03
            r1.A08(r7)
            android.widget.ImageView r6 = r0.A00
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            android.content.Context r1 = r9.getContext()
            X.5MG r2 = new X.5MG
            r2.<init>(r1)
            r1 = 2131896402(0x7f122852, float:1.9427664E38)
            java.lang.String r1 = r2.A03(r1)
            r4.append(r1)
            X.4uZ r1 = r7.A0H
            java.lang.String r1 = X.C627336j.A07(r1)
            java.lang.String r1 = X.AnonymousClass000.A0X(r1, r4)
            X.AnonymousClass0YZ.A0F(r6, r1)
            com.whatsapp.payments.ui.PaymentGroupParticipantPickerActivity r6 = r9.A02
            X.5Uq r2 = r6.A06
            android.widget.ImageView r1 = r0.A00
            r2.A08(r1, r7)
            android.widget.ImageView r4 = r0.A00
            r2 = 7
            X.9oz r1 = new X.9oz
            r1.<init>(r7, r9, r0, r2)
            r4.setOnClickListener(r1)
            X.99n r2 = r6.A0B
            java.lang.Class<com.whatsapp.jid.UserJid> r4 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r7.A0I(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            int r1 = r2.A05(r1)
            r8 = 2
            if (r1 == r8) goto L_0x0112
            X.5YB r1 = r0.A03
            r2 = 1056964608(0x3f000000, float:0.5)
            com.whatsapp.TextEmojiLabel r1 = r1.A02
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r5)
            X.2k5 r1 = r7.A0F
            if (r1 == 0) goto L_0x0101
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0101
            android.widget.TextView r2 = r0.A01
            r1 = 2131888117(0x7f1207f5, float:1.941086E38)
        L_0x00fe:
            r2.setText(r1)
        L_0x0101:
            java.lang.String r1 = r7.A0b
            if (r1 == 0) goto L_0x0111
            X.2k5 r1 = r7.A0F
            if (r1 == 0) goto L_0x0176
            java.lang.String r1 = r1.A01
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0176
        L_0x0111:
            return r11
        L_0x0112:
            X.2sq r2 = r6.A02
            com.whatsapp.jid.Jid r1 = r7.A0I(r4)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            boolean r1 = r2.A0P(r1)
            if (r1 == 0) goto L_0x0134
            X.5YB r1 = r0.A03
            r2 = 1056964608(0x3f000000, float:0.5)
            com.whatsapp.TextEmojiLabel r1 = r1.A02
            r1.setAlpha(r2)
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r5)
            android.widget.TextView r2 = r0.A01
            r1 = 2131894580(0x7f122134, float:1.9423969E38)
            goto L_0x00fe
        L_0x0134:
            X.1VX r2 = r6.A0D
            r1 = 733(0x2dd, float:1.027E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 != 0) goto L_0x0148
            X.1VX r2 = r6.A0D
            r1 = 544(0x220, float:7.62E-43)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0101
        L_0x0148:
            X.6hl r2 = r3.A01
            X.9U4 r1 = r6.A0C
            X.9TC r1 = X.AnonymousClass9U4.A04(r1)
            if (r1 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x0101
            X.7g1 r1 = r2.A08()
            long r3 = r1.A00
            r1 = 12
            long r3 = r3 >> r1
            r1 = 15
            long r3 = r3 & r1
            int r1 = (int) r3
            if (r1 != r8) goto L_0x0101
            android.widget.TextView r1 = r0.A01
            r1.setVisibility(r5)
            android.widget.TextView r2 = r0.A01
            r1 = 2131892002(0x7f121722, float:1.941874E38)
            goto L_0x00fe
        L_0x016e:
            java.lang.Object r0 = r11.getTag()
            X.9Pf r0 = (X.C193589Pf) r0
            goto L_0x003f
        L_0x0176:
            com.whatsapp.TextEmojiLabel r1 = r0.A02
            r1.setVisibility(r5)
            com.whatsapp.TextEmojiLabel r2 = r0.A02
            X.5ZU r0 = r6.A05
            java.lang.String r1 = r0.A0N(r7)
            r0 = 0
            r2.A0K(r0, r1)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass947.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass947(Context context, PaymentGroupParticipantPickerActivity paymentGroupParticipantPickerActivity, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A02 = paymentGroupParticipantPickerActivity;
        this.A01 = LayoutInflater.from(context);
        this.A00 = AnonymousClass002.A0J(list);
    }

    public int getCount() {
        List list = this.A00;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }
}
