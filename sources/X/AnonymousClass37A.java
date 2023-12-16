package X;

import android.content.DialogInterface;
import android.os.Bundle;
import com.whatsapp.util.Log;

/* renamed from: X.37A  reason: invalid class name */
public final /* synthetic */ class AnonymousClass37A implements DialogInterface.OnClickListener {
    public final /* synthetic */ C89654ea A00;
    public final /* synthetic */ AnonymousClass5WY A01;
    public final /* synthetic */ C29441ip A02;
    public final /* synthetic */ C620633i A03;
    public final /* synthetic */ AnonymousClass5ZR A04;
    public final /* synthetic */ C53202mi A05;
    public final /* synthetic */ C56912sl A06;
    public final /* synthetic */ AnonymousClass4FS A07;

    public final void onClick(DialogInterface dialogInterface, int i) {
        C89654ea r4 = this.A00;
        AnonymousClass4FS r1 = this.A07;
        AnonymousClass5WY r5 = this.A01;
        C620633i r7 = this.A03;
        C53202mi r10 = this.A05;
        AnonymousClass5ZR r8 = this.A04;
        C56912sl r11 = this.A06;
        C29441ip r6 = this.A02;
        Log.i("RegistrationUtils/createCannotConnectDialog/dialog/cant-connect/button/checkstatus");
        C621433s.A00(r4, 109);
        r1.BkL(new C33881tq((Bundle) null, r4, r5, r6, r7, r8, (C631938h) null, r10, r11, "reg/cant-connect", true, true, false), new String[0]);
    }

    public /* synthetic */ AnonymousClass37A(C89654ea r1, AnonymousClass5WY r2, C29441ip r3, C620633i r4, AnonymousClass5ZR r5, C53202mi r6, C56912sl r7, AnonymousClass4FS r8) {
        this.A00 = r1;
        this.A07 = r8;
        this.A01 = r2;
        this.A03 = r4;
        this.A05 = r6;
        this.A04 = r5;
        this.A06 = r7;
        this.A02 = r3;
    }
}
