package X;

import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: X.1hx  reason: invalid class name and case insensitive filesystem */
public class C28901hx extends C61102zi {
    public void A08() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ChatTransferViewModel chatTransferViewModel = ((AnonymousClass3R4) A03.next()).A00;
            chatTransferViewModel.A0X.A01(8);
            chatTransferViewModel.A0J(4);
        }
    }

    public void A09() {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ChatTransferViewModel chatTransferViewModel = ((AnonymousClass3R4) A03.next()).A00;
            chatTransferViewModel.A0H();
            if (!chatTransferViewModel.A06) {
                chatTransferViewModel.A0X.A01(15);
            }
            chatTransferViewModel.A0J(5);
        }
    }

    public void A0A(int i, String str) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            AnonymousClass3R4 r1 = (AnonymousClass3R4) A03.next();
            r1.A00.A0X.A00 = str;
            r1.onError(i);
        }
    }

    public void A0B(InputStream inputStream, OutputStream outputStream) {
        AnonymousClass4DD r5;
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            ChatTransferViewModel chatTransferViewModel = ((AnonymousClass3R4) A03.next()).A00;
            InputStream inputStream2 = inputStream;
            OutputStream outputStream2 = outputStream;
            if (chatTransferViewModel.A06) {
                C64333Db r2 = chatTransferViewModel.A0I.A00.A02;
                C56612sH A2p = C64333Db.A2p(r2);
                AnonymousClass1VX A4B = C64333Db.A4B(r2);
                C107695bk r3 = r2.A00;
                C48152eR r10 = (C48152eR) r2.A9R.get();
                C28901hx r13 = (C28901hx) r3.A8X.get();
                C55362qE r11 = (C55362qE) r2.A9V.get();
                C56022rI r9 = (C56022rI) r2.AMv.get();
                r5 = new AnonymousClass3RA(A2p, (C57162tC) r2.AaV.get(), A4B, r9, r10, r11, (C50592iR) r3.A4A.get(), r13, (C55112po) r3.A75.get(), inputStream2, outputStream2);
            } else {
                C64333Db r22 = chatTransferViewModel.A0J.A00.A02;
                C56612sH A2p2 = C64333Db.A2p(r22);
                AnonymousClass1VX A4B2 = C64333Db.A4B(r22);
                C107695bk r32 = r22.A00;
                C50982j5 r112 = (C50982j5) r22.AHO.get();
                C28901hx r14 = (C28901hx) r32.A8X.get();
                C384527p r16 = new C384527p();
                C53222mk r102 = (C53222mk) r32.A57.get();
                C56022rI r12 = (C56022rI) r22.AMv.get();
                r5 = new AnonymousClass3RB((AnonymousClass310) r22.A9r.get(), A2p2, (C57162tC) r22.AaV.get(), A4B2, r102, r112, r12, (AnonymousClass2UI) r32.A69.get(), r14, (C55112po) r32.A75.get(), r16, inputStream2, outputStream2);
            }
            chatTransferViewModel.A04 = r5;
            r5.run();
        }
    }
}
