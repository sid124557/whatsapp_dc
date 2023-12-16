package com.whatsapp.chatlock.dialogs;

import X.AnonymousClass0x2;
import X.AnonymousClass2FE;
import X.AnonymousClass4FS;
import X.AnonymousClass58T;
import X.AnonymousClass5S5;
import X.AnonymousClass5UK;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C43102Qu;
import X.C46932cR;
import X.C56522s7;
import X.C69253Wh;
import X.C71653cS;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;

public final class ChatLockQuickAddHelperBottomSheet extends Hilt_ChatLockQuickAddHelperBottomSheet {
    public int A00 = 5;
    public C46932cR A01;
    public C43102Qu A02;
    public AnonymousClass5UK A03;
    public C56522s7 A04;
    public C95814uZ A05;
    public C69253Wh A06;
    public AnonymousClass4FS A07;
    public boolean A08;

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18280x3.A0E(view, R.id.description);
        View A0E = C18280x3.A0E(view, R.id.continue_button);
        C46932cR r1 = this.A01;
        if (r1 != null) {
            r1.A00(textEmojiLabel, new AnonymousClass2FE(this));
            View A0E2 = C18280x3.A0E(view, R.id.leaky_companion_view);
            AnonymousClass4FS r2 = this.A07;
            if (r2 != null) {
                r2.BkM(new C71653cS(this, 16, A0E2));
                AnonymousClass5UK r4 = this.A03;
                if (r4 != null) {
                    r4.A04(this.A05, Integer.valueOf(this.A00), (Integer) null, 11);
                    AnonymousClass0x2.A0z(A0E, this, 18);
                    return;
                }
                throw C18270x1.A0S("chatLockLogger");
            }
            throw C18270x1.A0S("waWorkers");
        }
        throw C18270x1.A0S("chatLockLinkUtil");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C162457s7.A0J(dialogInterface, 0);
        C43102Qu r5 = this.A02;
        if (r5 != null) {
            if (this.A08) {
                r5.A04.A09(r5.A01, r5.A02, r5.A03, r5.A00);
            } else {
                r5.A03.BaI(new AnonymousClass5S5(AnonymousClass58T.CANCELED, (Integer) null, (Integer) null));
            }
        }
        super.onDismiss(dialogInterface);
    }

    public int A1S() {
        return R.layout.f8nameremoved;
    }
}
