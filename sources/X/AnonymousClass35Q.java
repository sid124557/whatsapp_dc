package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.35Q  reason: invalid class name */
public final class AnonymousClass35Q {
    public final C51152jM A00;
    public final C34461vC A01;
    public final AnonymousClass5ZU A02;
    public final C56612sH A03;
    public final C54292oU A04;
    public final C60972zT A05;
    public final C45932ao A06;
    public final C48092eK A07;
    public final AnonymousClass66R A08 = C154517dI.A01(new C76743sH(this));
    public final AnonymousClass66R A09 = C154517dI.A01(C120995zV.A00);
    public final AnonymousClass66R A0A = C154517dI.A01(new C118795vw(this));

    public final File A03(String str) {
        String A0X;
        AnonymousClass66R r1 = this.A0A;
        if (!C18290x4.A1Y(r1)) {
            A0X = "AccountSwitchingFileManager/getInactiveAccountDatabasesDir/staging dir does not exist";
        } else {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists()) {
                return C18330xA.A04(A0B.getAbsolutePath(), "databases");
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            C57072t2.A03("AccountSwitchingFileManager/getInactiveAccountDatabasesDir/account ", str, A0o);
            C18260x0.A1L(A0o, " dir does not exist");
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("AccountSwitchingFileManager/getInactiveAccountDatabasesDir/stagingDirLogString/");
            A0X = AnonymousClass000.A0X(C57072t2.A00(this), A0o2);
        }
        Log.i(A0X);
        return null;
    }

    public final List A04() {
        String str;
        int length;
        AnonymousClass66R r1 = this.A0A;
        if (!C18290x4.A1Y(r1)) {
            str = "AccountSwitchingFileManager/getLidsInStagedDir/staging directory doesn't exist";
        } else {
            File[] listFiles = ((File) r1.getValue()).listFiles();
            int i = 0;
            if (listFiles == null || (length = listFiles.length) == 0) {
                str = "AccountSwitchingFileManager/getLidsInStagedDir/no accounts found in staged directory";
            } else {
                ArrayList A0I = AnonymousClass002.A0I(length);
                do {
                    A0I.add(listFiles[i].getName());
                    i++;
                } while (i < length);
                return A0I;
            }
        }
        Log.e(str);
        return C72023d3.A00;
    }

    public final void A05(RandomAccessFile randomAccessFile, String str, String str2) {
        boolean renameTo;
        boolean renameTo2;
        Iterator A0q = C18320x8.A0q(this.A09.getValue());
        while (A0q.hasNext()) {
            String A0m = AnonymousClass001.A0m(A0q);
            boolean A022 = A02(str2, A0m);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AccountSwitchingFileManager/moveDirectories/delete ");
            A0o.append(str2);
            A0o.append('/');
            A0o.append(A0m);
            C18260x0.A1E(" directory: ", A0o, A022);
            C18260x0.A0V(A0m, str, str2);
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("moving:");
            A0o2.append(A0m);
            A0o2.append(":from:");
            A0o2.append(str);
            String A0V = AnonymousClass000.A0V(":to:", str2, A0o2);
            randomAccessFile.writeBytes(A0V);
            C18260x0.A0s("AccountSwitchingRecoveryManager/recordPreFileMoving/recorded: ", A0V, AnonymousClass001.A0o());
            File A042 = C18330xA.A04(str, A0m);
            if (!A042.exists()) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("AccountSwitchingFileManager/moveToDir/");
                A0o3.append(A0m);
                C18260x0.A0r(" doesn't exist in ", str, A0o3);
                renameTo = false;
            } else {
                renameTo = A042.renameTo(C18330xA.A04(str2, A0m));
            }
            StringBuilder A0o4 = AnonymousClass001.A0o();
            A0o4.append("AccountSwitchingFileManager/moveDirectories/move ");
            A0o4.append(A0m);
            A0o4.append(" from ");
            A0o4.append(str);
            A0o4.append(" to ");
            A0o4.append(str2);
            C18260x0.A1E(": ", A0o4, renameTo);
            if (!renameTo) {
                StringBuilder A0o5 = AnonymousClass001.A0o();
                C18260x0.A0p("AccountSwitchingFileManager/moveDirectories/failed to move ", A0m, " from ", str, A0o5);
                A0o5.append(" to ");
                A0o5.append(str2);
                C18260x0.A1K(A0o5, ". Trying again after delay");
                SystemClock.sleep(50);
                boolean A023 = A02(str2, A0m);
                StringBuilder A0o6 = AnonymousClass001.A0o();
                A0o6.append("AccountSwitchingFileManager/moveDirectories/retry delete ");
                A0o6.append(str2);
                A0o6.append('/');
                A0o6.append(A0m);
                C18260x0.A1E(" directory: ", A0o6, A023);
                File A043 = C18330xA.A04(str, A0m);
                if (!A043.exists()) {
                    StringBuilder A0o7 = AnonymousClass001.A0o();
                    A0o7.append("AccountSwitchingFileManager/moveToDir/");
                    A0o7.append(A0m);
                    C18260x0.A0r(" doesn't exist in ", str, A0o7);
                    renameTo2 = false;
                } else {
                    renameTo2 = A043.renameTo(C18330xA.A04(str2, A0m));
                }
                StringBuilder A0o8 = AnonymousClass001.A0o();
                C18260x0.A0p("AccountSwitchingFileManager/moveDirectories/retry move ", A0m, " from ", str, A0o8);
                A0o8.append(" to ");
                A0o8.append(str2);
                C18260x0.A1E(": ", A0o8, renameTo2);
                if (!renameTo2) {
                    StringBuilder A0o9 = AnonymousClass001.A0o();
                    C18260x0.A0p("Failed to move ", A0m, " from ", str, A0o9);
                    A0o9.append(" to ");
                    throw AnonymousClass000.A0I(str2, A0o9);
                }
            }
            StringBuilder A0o10 = AnonymousClass001.A0o();
            C18260x0.A0p("moved:", A0m, ":from:", str, A0o10);
            A0o10.append(":to:");
            A0o10.append(str2);
            String A0j = AnonymousClass001.A0j(A0o10, 10);
            long length = randomAccessFile.length() - 1;
            while (length > 0) {
                randomAccessFile.seek(length);
                if (randomAccessFile.readByte() == 10) {
                    break;
                }
                length--;
            }
            long j = 0;
            if (length != 0) {
                j = 1 + length;
            }
            randomAccessFile.seek(j);
            randomAccessFile.writeBytes(A0j);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            C18260x0.A0s("AccountSwitchingRecoveryManager/recordPostFileMoving/recorded: ", A0j, AnonymousClass001.A0o());
        }
    }

    public final boolean A07(String str) {
        C57072t2.A04("AccountSwitchingFileManager/copySharedPrefFileFromStaging/", str, AnonymousClass001.A0o());
        AnonymousClass66R r1 = this.A0A;
        if (C18290x4.A1Y(r1)) {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists()) {
                File A042 = C18330xA.A04(A0B.getAbsolutePath(), "shared_prefs");
                if (!A042.exists()) {
                    C57072t2.A02(this, "AccountSwitchingFileManager/copySharedPrefFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C57072t2.A03("AccountSwitchingFileManager/copySharedPrefFileFromStaging/shared prefs for ", str, A0o);
                    C18260x0.A1K(A0o, " does not exist");
                    return false;
                }
                File A043 = C18330xA.A04(A042.getAbsolutePath(), "com.google.android.gms.appid.xml");
                if (!A043.exists()) {
                    StringBuilder A0m = AnonymousClass000.A0m("AccountSwitchingFileManager/copySharedPrefFileFromStaging/", "com.google.android.gms.appid.xml");
                    C57072t2.A03(" file for ", str, A0m);
                    C18260x0.A1K(A0m, " doesn't exist");
                    return false;
                }
                File A044 = C18330xA.A04(AnonymousClass0x9.A13(this.A08), "shared_prefs");
                if (A044.exists() || A044.mkdirs()) {
                    C627536m.A0N(this.A07, A043, AnonymousClass002.A0A(A044, "com.google.android.gms.appid.xml"));
                    return true;
                }
                throw AnonymousClass001.A0e("Unable to create shared_prefs directory");
            }
            C57072t2.A02(this, "AccountSwitchingFileManager/copySharedPrefFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C57072t2.A03("Account ", str, A0o2);
            throw AnonymousClass000.A0I(" directory does not exist", A0o2);
        }
        throw AnonymousClass001.A0e("Staging Directory don't exist");
    }

    public AnonymousClass35Q(C51152jM r2, C34461vC r3, AnonymousClass5ZU r4, C56612sH r5, C54292oU r6, C60972zT r7, C45932ao r8, C48092eK r9) {
        C18260x0.A0f(r5, r6, r8, r4, r3);
        C18260x0.A0W(r7, r9, r2);
        this.A03 = r5;
        this.A04 = r6;
        this.A06 = r8;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A07 = r9;
        this.A00 = r2;
    }

    public static final /* synthetic */ void A00(AnonymousClass35Q r4, RandomAccessFile randomAccessFile, String str) {
        C57072t2.A04("AccountSwitchingFileManager/restoreAccountDataForLid/", str, AnonymousClass001.A0o());
        AnonymousClass66R r1 = r4.A0A;
        if (C18290x4.A1Y(r1)) {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists()) {
                String absolutePath = A0B.getAbsolutePath();
                C162457s7.A0D(absolutePath);
                r4.A05(randomAccessFile, absolutePath, AnonymousClass0x9.A13(r4.A08));
                boolean delete = A0B.delete();
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A10(A0B, "AccountSwitchingFileManager/restoreAccountDataForLid/cleaned up ", A0o);
                C18260x0.A1E(": ", A0o, delete);
                return;
            }
            C57072t2.A02(r4, "AccountSwitchingFileManager/restoreAccountDataForLid/stagingDirLogString/", AnonymousClass001.A0o());
            StringBuilder A0o2 = AnonymousClass001.A0o();
            C57072t2.A03("Account ", str, A0o2);
            throw AnonymousClass000.A0I(" directory does not exist", A0o2);
        }
        throw AnonymousClass001.A0e("Staging Directory don't exist");
    }

    public static final /* synthetic */ void A01(AnonymousClass35Q r3, RandomAccessFile randomAccessFile, String str) {
        C57072t2.A04("AccountSwitchingFileManager/stageAccountDataForLid/", str, AnonymousClass001.A0o());
        AnonymousClass66R r1 = r3.A0A;
        if (C18290x4.A1Y(r1) || ((File) r1.getValue()).mkdirs()) {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists() || A0B.mkdirs()) {
                String A13 = AnonymousClass0x9.A13(r3.A08);
                String absolutePath = A0B.getAbsolutePath();
                C162457s7.A0D(absolutePath);
                r3.A05(randomAccessFile, A13, absolutePath);
                return;
            }
            throw AnonymousClass001.A0e("Unable to create directory for current account");
        }
        throw AnonymousClass001.A0e("Unable to create staging directory");
    }

    public static final boolean A02(String str, String str2) {
        File A042 = C18330xA.A04(str, str2);
        if (A042.exists()) {
            return C174438Un.A00(A042);
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AccountSwitchingFileManager/deleteDirectoryInPath/");
        A0o.append(str2);
        C18260x0.A0s(" doesn't exist in ", str, A0o);
        return true;
    }

    public final boolean A06(String str) {
        C57072t2.A04("AccountSwitchingFileManager/copyDbFileFromStaging/", str, AnonymousClass001.A0o());
        AnonymousClass66R r1 = this.A0A;
        if (C18290x4.A1Y(r1)) {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists()) {
                File A042 = C18330xA.A04(A0B.getAbsolutePath(), "databases");
                if (!A042.exists()) {
                    C57072t2.A02(this, "AccountSwitchingFileManager/copyDbFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C57072t2.A03("AccountSwitchingFileManager/copyDbFileFromStaging/db dir for ", str, A0o);
                    C18260x0.A1L(A0o, " does not exist");
                    return false;
                }
                File A043 = C18330xA.A04(A042.getAbsolutePath(), "account_switcher.db");
                if (!A043.exists()) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C57072t2.A03("AccountSwitchingFileManager/copyDbFileFromStaging/account_switcher.db file for ", str, A0o2);
                    C18260x0.A1K(A0o2, " doesn't exist");
                    return false;
                }
                File A044 = C18330xA.A04(AnonymousClass0x9.A13(this.A08), "databases");
                if (A044.exists() || A044.mkdirs()) {
                    File A0A2 = AnonymousClass002.A0A(A044, "account_switcher.db");
                    C48092eK r6 = this.A07;
                    C627536m.A0N(r6, A043, A0A2);
                    List list = AnonymousClass5CX.A00;
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        String A0m = AnonymousClass001.A0m(it);
                        File A0B2 = AnonymousClass002.A0B(AnonymousClass000.A0V(A043.getPath(), A0m, AnonymousClass001.A0o()));
                        if (A0B2.exists()) {
                            C627536m.A0N(r6, A0B2, AnonymousClass002.A0A(A044, AnonymousClass000.A0T("account_switcher.db", A0m)));
                        }
                    }
                    A043.delete();
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C18270x1.A0x(AnonymousClass002.A0B(AnonymousClass000.A0V(A043.getPath(), AnonymousClass001.A0m(it2), AnonymousClass001.A0o())));
                    }
                    return true;
                }
                throw AnonymousClass001.A0e("Unable to create databases directory");
            }
            C57072t2.A02(this, "AccountSwitchingFileManager/copyDbFileFromStaging/stagingDirLogString/", AnonymousClass001.A0o());
            StringBuilder A0o3 = AnonymousClass001.A0o();
            C57072t2.A03("Account ", str, A0o3);
            throw AnonymousClass000.A0I(" directory does not exist", A0o3);
        }
        throw AnonymousClass001.A0e("Staging directory does not exist");
    }

    public final boolean A08(String str, boolean z) {
        File file;
        StringBuilder A0o = AnonymousClass001.A0o();
        C57072t2.A03("AccountSwitchingFileManager/moveLogsDirectory/lid: ", str, A0o);
        C18260x0.A1E(" restoring: ", A0o, z);
        AnonymousClass66R r1 = this.A0A;
        if (C18290x4.A1Y(r1)) {
            File A0B = C18270x1.A0B(str, r1);
            if (A0B.exists()) {
                File A042 = C18330xA.A04(A0B.getAbsolutePath(), "files/Logs");
                String A13 = AnonymousClass0x9.A13(this.A08);
                if (!z) {
                    file = C18330xA.A04(A13, "files/Logs");
                } else {
                    file = A042;
                    A042 = C18330xA.A04(A13, "files/Logs");
                }
                if (!A042.exists()) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("AccountSwitchingFileManager/moveLogsDirectory/");
                    A0o2.append(A042);
                    C18260x0.A1M(A0o2, " directory not found");
                    return false;
                } else if (file.exists() || file.mkdirs()) {
                    if (!z && file.exists()) {
                        C174438Un.A00(file);
                    }
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("AccountSwitchingFileManager/moveLogsDirectory/Moving Logs from ");
                    A0o3.append(A042);
                    C18260x0.A1R(A0o3, " to ", file);
                    Log.flush();
                    return A042.renameTo(file);
                } else {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "AccountSwitchingFileManager/moveLogsDirectory/Unable to create ", file);
                    return false;
                }
            } else {
                C57072t2.A02(this, "AccountSwitchingFileManager/moveLogsDirectory/stagingDirLogString/", AnonymousClass001.A0o());
                StringBuilder A0o4 = AnonymousClass001.A0o();
                C57072t2.A03("Account ", str, A0o4);
                throw AnonymousClass000.A0I(" directory does not exist", A0o4);
            }
        } else {
            throw AnonymousClass001.A0e("Staging Directory don't exist");
        }
    }
}
