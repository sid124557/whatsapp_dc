package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Iterator;

/* renamed from: X.4Iw  reason: invalid class name and case insensitive filesystem */
public class C86114Iw implements AnonymousClass66S {
    public Object A00;
    public String A01;
    public final int A02;

    public C86114Iw(AnonymousClass35Q r1, String str, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A00 = r1;
            this.A01 = str;
        } else {
            this.A01 = str;
            this.A00 = r1;
        }
    }

    public void Ayo(RandomAccessFile randomAccessFile) {
        if (this.A02 != 0) {
            Log.i("AccountSwitchingFileManager/restoreAccount/checkpointOps");
            AnonymousClass35Q.A00((AnonymousClass35Q) this.A00, randomAccessFile, this.A01);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitchingFileManager/prepForAddingNewAccount/checkpointOps/");
        String str = this.A01;
        C18260x0.A1L(A0o, C57072t2.A01(str));
        AnonymousClass35Q.A01((AnonymousClass35Q) this.A00, randomAccessFile, str);
    }

    public void Bh6() {
        boolean z;
        StringBuilder A0o;
        String str;
        String A0X;
        if (this.A02 == 0) {
            AnonymousClass35Q r4 = (AnonymousClass35Q) this.A00;
            String str2 = this.A01;
            C18260x0.A1E("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/moveLogsBackToActiveDirectory: ", AnonymousClass001.A0o(), r4.A08(str2, false));
            C18260x0.A1E("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyGoogleGcmFile:", AnonymousClass001.A0o(), r4.A07(str2));
            C18260x0.A1E("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyDbFile:", AnonymousClass001.A0o(), r4.A06(str2));
            C57072t2.A04("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/", str2, AnonymousClass001.A0o());
            AnonymousClass66R r1 = r4.A0A;
            if (!C18290x4.A1Y(r1)) {
                A0X = "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/staging Directory doesn't exist";
            } else {
                File A0B = C18270x1.A0B(str2, r1);
                if (!A0B.exists()) {
                    C57072t2.A02(r4, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
                    A0o = AnonymousClass001.A0o();
                    C57072t2.A03("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/account ", str2, A0o);
                    str = " directory does not exist";
                } else {
                    File A04 = C18330xA.A04(A0B.getAbsolutePath(), "cache");
                    if (!A04.exists()) {
                        C57072t2.A02(r4, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
                        A0o = AnonymousClass001.A0o();
                        C57072t2.A03("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/cache directory for ", str2, A0o);
                        str = " does not exist";
                    } else {
                        File A0A = C18270x1.A0A(C54292oU.A02(r4.A04), ".health", AnonymousClass000.A0l("anr_detector_secondary_process"));
                        File A042 = C18330xA.A04(A04.getAbsolutePath(), A0A.getName());
                        if (!A042.exists()) {
                            StringBuilder A0k = AnonymousClass000.A0k(A042, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/");
                            C57072t2.A03(" file for ", str2, A0k);
                            C18260x0.A1L(A0k, " doesn't exist");
                            z = false;
                            C18260x0.A1E("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass001.A0o(), z);
                        }
                        File A043 = C18330xA.A04(AnonymousClass0x9.A13(r4.A08), "cache");
                        if (!A043.exists() && !A043.mkdirs()) {
                            C57072t2.A02(r4, "AccountSwitchingFileManager/copyAnrHealthFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
                            Log.e("AccountSwitchingFileManager/copyAnrHealthFileFromStaging/unable to create cache directory");
                        }
                        C627536m.A0N(r4.A07, A042, A0A);
                        z = true;
                        C18260x0.A1E("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass001.A0o(), z);
                    }
                }
                A0X = AnonymousClass000.A0X(str, A0o);
            }
            Log.e(A0X);
            z = false;
            C18260x0.A1E("AccountSwitchingFileManager/prepForAddingNewAccount/postCheckpointOps/copyAnrHealthFile:", AnonymousClass001.A0o(), z);
        }
    }

    public void BhF() {
        String str;
        if (this.A02 != 0) {
            Log.i("AccountSwitchingFileManager/restoreAccount/preCheckpointOps");
            AnonymousClass35Q r6 = (AnonymousClass35Q) this.A00;
            String str2 = this.A01;
            C57072t2.A04("AccountSwitchingFileManager/copyDbFileToStaging/", str2, AnonymousClass001.A0o());
            File A04 = C18330xA.A04(AnonymousClass0x9.A13(r6.A08), "databases");
            if (!A04.exists()) {
                str = "AccountSwitchingFileManager/copyDbFileToStaging/App database directory doesn't exist";
            } else {
                File A042 = C18330xA.A04(A04.getAbsolutePath(), "account_switcher.db");
                if (!A042.exists()) {
                    str = "AccountSwitchingFileManager/copyDbFileToStaging/account_switcher.db file for current account doesn't exist";
                } else {
                    AnonymousClass66R r1 = r6.A0A;
                    if (C18290x4.A1Y(r1)) {
                        File A0B = C18270x1.A0B(str2, r1);
                        if (A0B.exists()) {
                            File A0A = AnonymousClass002.A0A(A0B, "databases");
                            if (A0A.exists()) {
                                File A0A2 = AnonymousClass002.A0A(A0A, "account_switcher.db");
                                C48092eK r3 = r6.A07;
                                C627536m.A0N(r3, A042, A0A2);
                                Iterator it = AnonymousClass5CX.A00.iterator();
                                while (it.hasNext()) {
                                    String A0m = AnonymousClass001.A0m(it);
                                    File A0B2 = AnonymousClass002.A0B(AnonymousClass000.A0V(A042.getPath(), A0m, AnonymousClass001.A0o()));
                                    if (A0B2.exists()) {
                                        C627536m.A0N(r3, A0B2, AnonymousClass002.A0A(A0A, AnonymousClass000.A0T("account_switcher.db", A0m)));
                                    }
                                }
                                r6.A08(str2, true);
                            }
                            C57072t2.A02(r6, "AccountSwitchingFileManager/copyDbFileToStaging/stagingDirLogString/", AnonymousClass001.A0o());
                            throw AnonymousClass001.A0e("databases directory does not exist in staged directory");
                        }
                        C57072t2.A02(r6, "AccountSwitchingFileManager/copyDbFileToStaging/stagingDirLogString/", AnonymousClass001.A0o());
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C57072t2.A03("Account ", str2, A0o);
                        throw AnonymousClass000.A0I(" directory does not exist", A0o);
                    }
                    throw AnonymousClass001.A0e("Staging directory don't exist");
                }
            }
            Log.i(str);
            r6.A08(str2, true);
        }
    }
}
