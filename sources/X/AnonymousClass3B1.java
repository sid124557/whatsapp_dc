package X;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;

/* renamed from: X.3B1  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3B1 implements OnSuccessListener {
    public final /* synthetic */ C187708xg A00;
    public final /* synthetic */ AnonymousClass7GI A01;
    public final /* synthetic */ AnonymousClass2I1 A02;
    public final /* synthetic */ byte[] A03;

    public final void onSuccess(Object obj) {
        AnonymousClass7GI r3 = this.A01;
        byte[] bArr = this.A03;
        C187708xg r7 = this.A00;
        AnonymousClass2I1 r5 = this.A02;
        Boolean bool = (Boolean) obj;
        r3.A00 = bool.booleanValue();
        C18260x0.A1R(AnonymousClass001.A0o(), "BackupTokenUtils/setBlockStoreBytes/isE2EEAvailable ", bool);
        r3.A01 = bArr;
        C127306Rl r6 = new C127306Rl(bArr, r3.A00);
        C127036Qj r72 = (C127036Qj) r7;
        C157487iN r4 = new C157487iN((AnonymousClass70D) null);
        r4.A03 = new C127806Tj[]{C1461979a.A03, C1461979a.A05};
        r4.A01 = new AnonymousClass89W(r6, r72);
        r4.A00 = 1645;
        r4.A02 = false;
        Task A022 = r72.A02(r4.A00(), 1);
        A022.addOnSuccessListener(new AnonymousClass3B0(r5, bool));
        A022.addOnFailureListener(new C63813Az(r5, bool));
    }

    public /* synthetic */ AnonymousClass3B1(C187708xg r1, AnonymousClass7GI r2, AnonymousClass2I1 r3, byte[] bArr) {
        this.A01 = r2;
        this.A03 = bArr;
        this.A00 = r1;
        this.A02 = r3;
    }
}
