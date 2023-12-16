package X;

import java.io.File;
import java.util.Map;

/* renamed from: X.5nJ  reason: invalid class name and case insensitive filesystem */
public class C114605nJ implements C1228866f {
    public final /* synthetic */ AnonymousClass5JI A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;
    public final /* synthetic */ File A03;

    public C114605nJ(AnonymousClass5JI r1, File file, File file2, File file3) {
        this.A00 = r1;
        this.A03 = file;
        this.A02 = file2;
        this.A01 = file3;
    }

    public void BQe(long j) {
        this.A03.delete();
        this.A02.delete();
        this.A01.delete();
    }

    public /* synthetic */ void BPk(String str) {
    }

    public void BSF(String str) {
        C18260x0.A0r("MemoryExceptionsUploadHelper/Error: ", str, AnonymousClass001.A0o());
    }

    public void BaA(String str, Map map) {
        C18260x0.A0q("MemoryExceptionsUploadHelper/Response: ", str, AnonymousClass001.A0o());
    }
}
