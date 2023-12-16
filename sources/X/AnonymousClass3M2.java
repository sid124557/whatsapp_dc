package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3M2  reason: invalid class name */
public final class AnonymousClass3M2 implements C85034Er {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass1QN A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ AnonymousClass3ST A03;
    public final /* synthetic */ String A04;

    public AnonymousClass3M2(AnonymousClass1QN r1, UserJid userJid, AnonymousClass3ST r3, String str, long j) {
        this.A00 = j;
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = userJid;
        this.A04 = str;
    }

    public void BLr() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsLogger/ExtensionsV1Action/Pre-fetched aborted for flowVersionId:");
        A0o.append(this.A00);
        C18270x1.A1E(A0o, '.');
    }

    public /* bridge */ /* synthetic */ void BSD(Integer num) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsLogger/ExtensionsV1Action/Pre-fetched failed for flowVersionId:");
        A0o.append(this.A00);
        C18270x1.A1E(A0o, '.');
        this.A01.A04.A00(this.A02, this.A03, this.A04);
    }

    public /* bridge */ /* synthetic */ void Be9(Integer num) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsLogger/ExtensionsV1Action/Pre-fetched failed for flowVersionId:");
        A0o.append(this.A00);
        C18270x1.A1E(A0o, '.');
        this.A01.A04.A00(this.A02, this.A03, this.A04);
    }

    public void onSuccess() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ExtensionsLogger/ExtensionsV1Action/Pre-fetched layout for flowVersionId:");
        A0o.append(this.A00);
        C18260x0.A1J(A0o, " successfully.");
    }
}
