package X;

import com.whatsapp.migration.transfer.service.DonorP2pTransferService;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.net.Socket;

/* renamed from: X.2We  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C44472We {
    public final /* synthetic */ DonorP2pTransferService A00;

    public final void A00(String str) {
        DonorP2pTransferService donorP2pTransferService = this.A00;
        try {
            donorP2pTransferService.A05.A08();
            Log.i("fpm/DonorChatTransferService/Creating a socket");
            AnonymousClass2D6 r1 = donorP2pTransferService.A01;
            Socket createSocket = new C32541r6(C64333Db.A2q(r1.A00.A02), donorP2pTransferService.A08, (C46152bA) r1.A00.A02.AOf.get()).createSocket();
            AnonymousClass2D5 r12 = donorP2pTransferService.A00;
            C34131uH r0 = new C34131uH((C28901hx) r12.A00.A02.A00.A8X.get(), donorP2pTransferService.A08.A01, str, createSocket);
            donorP2pTransferService.A07 = r0;
            r0.start();
        } catch (IOException unused) {
            Log.e("fpm/DonorChatTransferService/Failed to create ssl socket");
            donorP2pTransferService.A05.A0A(604, "Failed to create ssl socket");
        }
    }

    public /* synthetic */ C44472We(DonorP2pTransferService donorP2pTransferService) {
        this.A00 = donorP2pTransferService;
    }
}
