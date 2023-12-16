package com.whatsapp.inappsupport.ui;

import X.AnonymousClass08M;
import X.AnonymousClass0x9;
import X.AnonymousClass1VX;
import X.AnonymousClass2TL;
import X.AnonymousClass4ER;
import X.AnonymousClass4FI;
import X.AnonymousClass4FS;
import X.AnonymousClass4IC;
import X.AnonymousClass4UC;
import X.C05550Ty;
import X.C162457s7;
import X.C18260x0;
import X.C28891hw;
import X.C46012aw;
import X.C56982ss;
import X.C58422vE;
import X.C69263Wi;
import X.C70003Zm;
import X.C95814uZ;
import com.whatsapp.util.Log;

public final class ContactUsWithAiViewModel extends C05550Ty implements AnonymousClass4ER {
    public C95814uZ A00;
    public boolean A01;
    public final AnonymousClass08M A02 = AnonymousClass08M.A01();
    public final AnonymousClass08M A03 = AnonymousClass08M.A01();
    public final C69263Wi A04;
    public final C56982ss A05;
    public final AnonymousClass4FI A06 = new AnonymousClass4IC(this, 10);
    public final C28891hw A07;
    public final AnonymousClass1VX A08;
    public final AnonymousClass2TL A09;
    public final C46012aw A0A;
    public final AnonymousClass4UC A0B = AnonymousClass0x9.A0b();
    public final AnonymousClass4UC A0C = AnonymousClass0x9.A0b();
    public final AnonymousClass4FS A0D;

    public final boolean A0D(boolean z) {
        C95814uZ r1;
        if (this.A01) {
            return true;
        }
        boolean A0Y = this.A08.A0Y(C58422vE.A02, 819);
        if (!A0Y || (r1 = this.A00) == null || !this.A05.A0L(r1)) {
            if (z || !A0Y || this.A00 == null) {
                Log.i("ContactUsWithAiViewModel/openChatOrShowTicketHaveCreatedDialog - showing dialog");
                this.A03.A0H(Boolean.FALSE);
                this.A0C.A0H((Object) null);
            }
            return this.A01;
        }
        Log.i("ContactUsWithAiViewModel/openChatOrShowTicketCreatedDialog - opening chat");
        this.A03.A0H(Boolean.FALSE);
        C95814uZ r12 = this.A00;
        if (r12 != null) {
            this.A02.A0H(r12);
        }
        this.A01 = true;
        return this.A01;
    }

    public void BOp() {
        Log.i("ContactUsWithAiViewModel/onChatSupportTicketCreationDeliveryFailure");
        this.A03.A0H(Boolean.FALSE);
        this.A0B.A0H((Object) null);
    }

    public void BOq(int i) {
        Log.i("ContactUsWithAiViewModel/onChatSupportTicketCreationError");
        this.A03.A0H(Boolean.FALSE);
        this.A0B.A0H((Object) null);
    }

    public void BOr(C95814uZ r7) {
        Log.i("ContactUsWithAiViewModel/onChatSupportTicketCreationSuccess");
        this.A00 = r7;
        boolean z = false;
        this.A01 = false;
        C28891hw r4 = this.A07;
        AnonymousClass4FI r3 = this.A06;
        r4.A06(r3);
        int A0O = this.A08.A0O(C58422vE.A02, 974);
        int i = 0;
        if (0 < A0O) {
            i = A0O;
        } else {
            z = true;
        }
        if (!A0D(z)) {
            this.A04.A0T(C70003Zm.A00(this, 36), (long) i);
        } else {
            r4.A07(r3);
        }
    }

    public ContactUsWithAiViewModel(C69263Wi r3, C56982ss r4, C28891hw r5, AnonymousClass1VX r6, AnonymousClass2TL r7, C46012aw r8, AnonymousClass4FS r9) {
        C18260x0.A0f(r3, r5, r8, r6, r4);
        C162457s7.A0J(r9, 7);
        this.A04 = r3;
        this.A07 = r5;
        this.A0A = r8;
        this.A08 = r6;
        this.A05 = r4;
        this.A09 = r7;
        this.A0D = r9;
    }
}
