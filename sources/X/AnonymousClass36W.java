package X;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.36W  reason: invalid class name */
public class AnonymousClass36W {
    public static final int A0G = 10;
    public static final int A0H = 5000;
    public static final long A0I = 64092211200L;
    public static final String A0J = "xpm-messages-exporter-";
    public long A00;
    public int A01;
    public long A02;
    public final C56612sH A03;
    public final C55682qk A04;
    public final C57162tC A05;
    public final AnonymousClass33p A06;
    public final C56982ss A07;
    public final C72303dV A08;
    public final C56382rt A09;
    public final C61232zv A0A;
    public final C28851hs A0B;
    public final C55362qE A0C;
    public final C54612p0 A0D;
    public final AnonymousClass1R1 A0E;
    public final C84924Eg A0F;

    public static void A06(AnonymousClass2T3 r9, OutputStream outputStream) {
        try {
            JSONObject A1G = AnonymousClass0x9.A1G();
            JSONObject A1G2 = AnonymousClass0x9.A1G();
            A1G2.put("creation_date", r9.A00);
            A1G2.put("os", r9.A05);
            A1G2.put("os_version", r9.A06);
            A1G2.put("app_name", r9.A02);
            A1G2.put("app_version", r9.A03);
            A1G2.put("format_version", r9.A04);
            A1G.put("header", A1G2);
            if (r9.A01 != null) {
                JSONObject A1G3 = AnonymousClass0x9.A1G();
                A1G.put("messages", A1G3);
                A1G3.put("filename", r9.A01.A00);
                A1G3.put("format", r9.A01.A01);
                JSONArray A1F = AnonymousClass0x9.A1F();
                A1G3.put("chunks", A1F);
                List<AnonymousClass2LR> list = r9.A01.A02;
                if (list != null) {
                    for (AnonymousClass2LR r4 : list) {
                        JSONObject A1G4 = AnonymousClass0x9.A1G();
                        A1G4.put("chunk_number", r4.A00);
                        A1G4.put("messages_count", r4.A01);
                        A1F.put(A1G4);
                    }
                }
            }
            AnonymousClass0x7.A1C(outputStream, A1G.toString(4), DefaultCrypto.UTF_8);
        } catch (IOException | JSONException e) {
            Log.e("Failed to write header information.", e);
            throw e;
        }
    }

    public Cursor A0A(int i, long j, long j2, long j3) {
        String[] strArr = new String[4];
        C18270x1.A1S(strArr, j);
        AnonymousClass0x2.A1S(strArr, 1, j2);
        AnonymousClass0x2.A1S(strArr, 2, j3);
        C18280x3.A1Q(strArr, i, 3);
        AnonymousClass4GK A032 = this.A08.get();
        try {
            return C56862sg.A00(A032, ((AnonymousClass3H0) A032).A03, C58162uo.A0J, "SELECT_MESSAGES_FOR_HISTORY_CHUNK_BY_VIEW_SQL", strArr);
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        r7 = r0.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ad, code lost:
        r2 = e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A0D(java.io.File r15) {
        /*
            r14 = this;
            r5 = 0
            if (r15 == 0) goto L_0x00ea
            boolean r0 = r15.exists()
            if (r0 == 0) goto L_0x00ea
            r8 = 1
            java.lang.String r6 = r15.getCanonicalPath()     // Catch:{ IOException -> 0x00d4 }
            int r10 = A01(r6)
            r4 = 0
            java.lang.String r7 = ""
            r9 = 0
        L_0x0016:
            r0 = 10
            if (r9 >= r0) goto L_0x00ab
            X.2qE r0 = r14.A0C     // Catch:{ IOException -> 0x00a8 }
            X.4GK r11 = X.C49112g0.A00(r0)     // Catch:{ IOException -> 0x00a8 }
            r0 = r11
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x009e }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x009e }
            java.lang.String r2 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.local_path = ?"
            java.lang.String[] r1 = new java.lang.String[r8]     // Catch:{ all -> 0x009e }
            r1[r4] = r6     // Catch:{ all -> 0x009e }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_BY_LOCAL_PATH_SINGLE"
            android.database.Cursor r2 = r3.A0E(r2, r0, r1)     // Catch:{ all -> 0x009e }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x003e
            r2.close()     // Catch:{ all -> 0x009e }
            r11.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x0049
        L_0x003e:
            X.2SO r0 = X.C59112wN.A00(r2)     // Catch:{ all -> 0x0092 }
            r2.close()     // Catch:{ all -> 0x009e }
            r11.close()     // Catch:{ IOException -> 0x00a8 }
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            if (r0 == 0) goto L_0x004d
            goto L_0x008f
        L_0x004d:
            int r0 = r10 % 100
            long r2 = (long) r0     // Catch:{ IOException -> 0x00a8 }
            int r0 = r10 / 100
            int r0 = r0 % 100
            long r0 = (long) r0     // Catch:{ IOException -> 0x00a8 }
            java.util.Locale r13 = java.util.Locale.US     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r12 = "Media/%d/%d/%d-%s"
            r11 = 4
            java.lang.Object[] r11 = new java.lang.Object[r11]     // Catch:{ IOException -> 0x00a8 }
            X.AnonymousClass000.A1Q(r11, r4, r2)     // Catch:{ IOException -> 0x00a8 }
            X.AnonymousClass000.A1Q(r11, r8, r0)     // Catch:{ IOException -> 0x00a8 }
            X.AnonymousClass000.A1N(r11, r10)     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r1 = r15.getName()     // Catch:{ IOException -> 0x00a8 }
            r0 = 3
            r11[r0] = r1     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r7 = java.lang.String.format(r13, r12, r11)     // Catch:{ IOException -> 0x00a8 }
            X.2qE r0 = r14.A0C     // Catch:{ IOException -> 0x00a8 }
            long r11 = r0.A02(r15, r7, r4)     // Catch:{ IOException -> 0x00a8 }
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r6)     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r0 = java.lang.String.valueOf(r10)     // Catch:{ IOException -> 0x00a8 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x00a8 }
            int r10 = A01(r0)     // Catch:{ IOException -> 0x00a8 }
            int r9 = r9 + 1
            goto L_0x0016
        L_0x008f:
            java.lang.String r7 = r0.A04     // Catch:{ IOException -> 0x00ad }
            goto L_0x00bf
        L_0x0092:
            r1 = move-exception
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ all -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x009e }
        L_0x009d:
            throw r1     // Catch:{ all -> 0x009e }
        L_0x009e:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00a7
        L_0x00a3:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x00a8 }
        L_0x00a7:
            throw r1     // Catch:{ IOException -> 0x00a8 }
        L_0x00a8:
            r2 = move-exception
            r8 = 0
            goto L_0x00ae
        L_0x00ab:
            r8 = 0
            goto L_0x00bf
        L_0x00ad:
            r2 = move-exception
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/IOException during file registration. Local path: "
            X.C18260x0.A0u(r0, r6, r1, r2)
            X.2qk r1 = r14.A04
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/IOException"
            X.C55682qk.A05(r1, r0, r2)
        L_0x00bf:
            if (r8 != 0) goto L_0x00d3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/File is not registered. Local path: "
            X.C18260x0.A0r(r0, r6, r1)
            X.2qk r1 = r14.A04
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/registerFile"
            r1.A0A(r0, r4, r5)
            return r5
        L_0x00d3:
            return r7
        L_0x00d4:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessagesExporter/exportMediaFile/Failed to get canonical file path: "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r15, r0, r1)
            X.C18260x0.A1K(r1, r0)
            X.2qk r1 = r14.A04
            java.lang.String r0 = "xpm-messages-exporter-exportMediaFile/getCanonicalPath"
            X.C55682qk.A05(r1, r0, r2)
        L_0x00ea:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36W.A0D(java.io.File):java.lang.String");
    }

    public static /* synthetic */ int A00(Pair pair, Pair pair2) {
        return -((Long) pair.second).compareTo((Long) pair2.second);
    }

    public static C21651Cq A02(int i) {
        if (i == 0) {
            return null;
        }
        C130546c9 A0G2 = C21651Cq.DEFAULT_INSTANCE.A0G();
        if ((i & 1) > 0) {
            C21651Cq r2 = (C21651Cq) C18320x8.A0C(A0G2);
            r2.bitField0_ |= 1;
            r2.downloadImages_ = true;
        }
        if ((i & 2) > 0) {
            C21651Cq r22 = (C21651Cq) C18320x8.A0C(A0G2);
            r22.bitField0_ |= 2;
            r22.downloadAudio_ = true;
        }
        if ((i & 4) > 0) {
            C21651Cq r23 = (C21651Cq) C18320x8.A0C(A0G2);
            r23.bitField0_ |= 4;
            r23.downloadVideo_ = true;
        }
        if ((i & 8) > 0) {
            C21651Cq r24 = (C21651Cq) C18320x8.A0C(A0G2);
            r24.bitField0_ |= 8;
            r24.downloadDocuments_ = true;
        }
        return (C21651Cq) A0G2.A06();
    }

    public static AnonymousClass1BU A03(C60272yH r4) {
        C130546c9 A0G2 = AnonymousClass1BU.DEFAULT_INSTANCE.A0G();
        String obj = r4.A04.A00.toString();
        AnonymousClass1BU r1 = (AnonymousClass1BU) C18320x8.A0C(A0G2);
        obj.getClass();
        r1.bitField0_ |= 1;
        r1.fbid_ = obj;
        String str = (String) r4.A05.A00;
        AnonymousClass1BU r12 = (AnonymousClass1BU) C18320x8.A0C(A0G2);
        str.getClass();
        r12.bitField0_ |= 2;
        r12.password_ = str;
        return (AnonymousClass1BU) A0G2.A06();
    }

    public static AnonymousClass1DV A04(C56802sa r4) {
        C130546c9 A0G2 = AnonymousClass1DV.DEFAULT_INSTANCE.A0G();
        if (r4.A08() != null) {
            String A082 = r4.A08();
            AnonymousClass1DV r1 = (AnonymousClass1DV) C18320x8.A0C(A0G2);
            A082.getClass();
            r1.bitField0_ |= 1;
            r1.messageVibrate_ = A082;
        }
        if (r4.A06() != null) {
            String A062 = r4.A06();
            AnonymousClass1DV r12 = (AnonymousClass1DV) C18320x8.A0C(A0G2);
            A062.getClass();
            r12.bitField0_ |= 2;
            r12.messagePopup_ = A062;
        }
        if (r4.A05() != null) {
            String A052 = r4.A05();
            AnonymousClass1DV r13 = (AnonymousClass1DV) C18320x8.A0C(A0G2);
            A052.getClass();
            r13.bitField0_ |= 4;
            r13.messageLight_ = A052;
        }
        boolean A0A2 = r4.A0A();
        AnonymousClass1DV r14 = (AnonymousClass1DV) C18320x8.A0C(A0G2);
        r14.bitField0_ |= 8;
        r14.lowPriorityNotifications_ = A0A2;
        boolean z = r4.A02().A0G;
        AnonymousClass1DV r15 = (AnonymousClass1DV) C18320x8.A0C(A0G2);
        r15.bitField0_ |= 16;
        r15.reactionsMuted_ = z;
        if (r4.A04() != null) {
            String A042 = r4.A04();
            AnonymousClass1DV r16 = (AnonymousClass1DV) C18320x8.A0C(A0G2);
            A042.getClass();
            r16.bitField0_ |= 32;
            r16.callVibrate_ = A042;
        }
        return (AnonymousClass1DV) A0G2.A06();
    }

    private boolean A09(C95814uZ r2) {
        return AnonymousClass000.A1X(C56982ss.A00(this.A07, r2));
    }

    public AnonymousClass1A0 A0B(Cursor cursor, CancellationSignal cancellationSignal, Map map) {
        C371120z r1 = C371120z.FOR_CHAT_TRANSFER;
        C162457s7.A0J(r1, 0);
        Cursor cursor2 = cursor;
        Map A012 = this.A0A.A01(cursor2, new C46002av(r1).A00(), new C86184Jd(this, 1), 0);
        if (A012.size() == 0) {
            return null;
        }
        AnonymousClass1A0 A0Z = AnonymousClass0x7.A0Z();
        A0Z.A0D(AnonymousClass23J.FULL);
        Iterator A0q = AnonymousClass000.A0q(A012);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            cancellationSignal.throwIfCanceled();
            C95814uZ A0N = C18320x8.A0N(A0w);
            C209619z r2 = (C209619z) A0w.getValue();
            if (!A09(C18310x6.A0S(((AnonymousClass1EG) r2.A00).id_))) {
                if (A0N instanceof C28011fL) {
                    this.A0A.A02((C28011fL) A0N, r2);
                }
                A0K(A0N, r2, map);
                A0Z.A0B(r2);
            }
        }
        return A0Z;
    }

    public C203517q A0C(C95814uZ r6, boolean z) {
        String str;
        int i;
        AnonymousClass2P1 BES = this.A0F.BES(r6, z);
        C203517q r3 = null;
        if (BES != null && BES.A01.equals("USER_PROVIDED") && (str = BES.A02) != null && !TextUtils.isEmpty(str)) {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() != null) {
                str = parse.getPath();
            }
            String A0D2 = A0D(AnonymousClass002.A0B(str));
            if (A0D2 != null) {
                r3 = (C203517q) AnonymousClass1BX.DEFAULT_INSTANCE.A0G();
                AnonymousClass1BX r1 = (AnonymousClass1BX) C18320x8.A0C(r3);
                r1.bitField0_ |= 1;
                r1.filename_ = A0D2;
                Integer num = BES.A00;
                if (num != null) {
                    i = num.intValue();
                } else {
                    i = 100;
                }
                AnonymousClass1BX r12 = (AnonymousClass1BX) C18320x8.A0C(r3);
                r12.bitField0_ |= 2;
                r12.opacity_ = i;
            }
        }
        return r3;
    }

    public void A0G() {
        AnonymousClass2T3 r2 = new AnonymousClass2T3();
        r2.A00 = System.currentTimeMillis();
        r2.A05 = "android";
        r2.A06 = String.valueOf(Build.VERSION.SDK_INT);
        r2.A02 = "consumer";
        r2.A03 = "2.23.26.14";
        r2.A04 = "1.0";
    }

    public void A0H(long j) {
        this.A00 = j;
    }

    public void A0J(CancellationSignal cancellationSignal, File file) {
        A0I(cancellationSignal, new C67863Qy(this), file);
    }

    public void A0L(AnonymousClass1A0 r6) {
        AnonymousClass23C A002;
        C130546c9 A0G2 = AnonymousClass1E8.DEFAULT_INSTANCE.A0G();
        C203517q A0C2 = A0C((C95814uZ) null, false);
        if (A0C2 != null) {
            AnonymousClass1E8 A0Y = AnonymousClass0x7.A0Y(A0G2);
            AnonymousClass1BX r0 = (AnonymousClass1BX) A0C2.A06();
            r0.getClass();
            A0Y.lightThemeWallpaper_ = r0;
            A0Y.bitField0_ |= 1;
        }
        C203517q A0C3 = A0C((C95814uZ) null, true);
        if (A0C3 != null) {
            AnonymousClass1E8 A0Y2 = AnonymousClass0x7.A0Y(A0G2);
            AnonymousClass1BX r02 = (AnonymousClass1BX) A0C3.A06();
            r02.getClass();
            A0Y2.darkThemeWallpaper_ = r02;
            A0Y2.bitField0_ |= 4;
        }
        int i = this.A0E.A0I().A01;
        if (i == 0) {
            A002 = AnonymousClass23C.DEFAULT;
        } else {
            A002 = AnonymousClass23C.A00(i);
        }
        AnonymousClass1E8 A0Y3 = AnonymousClass0x7.A0Y(A0G2);
        A0Y3.mediaVisibility_ = A002.value;
        A0Y3.bitField0_ |= 2;
        C21651Cq A022 = A02(AnonymousClass0x2.A0F(this.A06).getInt("autodownload_wifi_mask", 15));
        if (A022 != null) {
            AnonymousClass1E8 A0Y4 = AnonymousClass0x7.A0Y(A0G2);
            A0Y4.autoDownloadWiFi_ = A022;
            A0Y4.bitField0_ |= 8;
        }
        C21651Cq A023 = A02(AnonymousClass0x2.A0F(this.A06).getInt("autodownload_cellular_mask", 1));
        if (A023 != null) {
            AnonymousClass1E8 A0Y5 = AnonymousClass0x7.A0Y(A0G2);
            A0Y5.autoDownloadCellular_ = A023;
            A0Y5.bitField0_ |= 16;
        }
        C21651Cq A024 = A02(C18280x3.A02(AnonymousClass0x2.A0F(this.A06), "autodownload_roaming_mask"));
        if (A024 != null) {
            AnonymousClass1E8 A0Y6 = AnonymousClass0x7.A0Y(A0G2);
            A0Y6.autoDownloadRoaming_ = A024;
            A0Y6.bitField0_ |= 32;
        }
        this.A0E.A0I();
        boolean z = !this.A0E.A0I().A0A();
        AnonymousClass1E8 A0Y7 = AnonymousClass0x7.A0Y(A0G2);
        A0Y7.bitField0_ |= 64;
        A0Y7.showIndividualNotificationsPreview_ = z;
        AnonymousClass1DV A042 = A04(this.A0E.A0I());
        AnonymousClass1E8 A0Y8 = AnonymousClass0x7.A0Y(A0G2);
        A042.getClass();
        A0Y8.individualNotificationSettings_ = A042;
        A0Y8.bitField0_ |= 65536;
        this.A0E.A0H();
        boolean A0A2 = true ^ this.A0E.A0H().A0A();
        AnonymousClass1E8 A0Y9 = AnonymousClass0x7.A0Y(A0G2);
        A0Y9.bitField0_ |= 128;
        A0Y9.showGroupNotificationsPreview_ = A0A2;
        AnonymousClass1DV A043 = A04(this.A0E.A0H());
        AnonymousClass1E8 A0Y10 = AnonymousClass0x7.A0Y(A0G2);
        A043.getClass();
        A0Y10.groupNotificationSettings_ = A043;
        A0Y10.bitField0_ |= AnonymousClass35S.A0F;
        C60272yH A003 = this.A0D.A00();
        if (!(A003 == null || A003.A04.A00 == null || A003.A05.A00 == null)) {
            AnonymousClass1BU A032 = A03(A003);
            AnonymousClass1E8 A0Y11 = AnonymousClass0x7.A0Y(A0G2);
            A032.getClass();
            A0Y11.avatarUserSettings_ = A032;
            A0Y11.bitField0_ |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
        }
        int A012 = C615531h.A01(AnonymousClass0x2.A0F(this.A06).getString("interface_font_size", "0"), 0);
        AnonymousClass1E8 A0Y12 = AnonymousClass0x7.A0Y(A0G2);
        A0Y12.bitField0_ |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
        A0Y12.fontSize_ = A012;
        boolean A1W = C18280x3.A1W(AnonymousClass0x2.A0F(this.A06), "security_notifications");
        AnonymousClass1E8 A0Y13 = AnonymousClass0x7.A0Y(A0G2);
        A0Y13.bitField0_ |= ZipDecompressor.UNZIP_BUFFER_SIZE;
        A0Y13.securityNotifications_ = A1W;
        boolean A1W2 = C18280x3.A1W(AnonymousClass0x2.A0F(this.A06), "notify_new_message_for_archived_chats");
        AnonymousClass1E8 A0Y14 = AnonymousClass0x7.A0Y(A0G2);
        A0Y14.bitField0_ |= DefaultCrypto.BUFFER_SIZE;
        A0Y14.autoUnarchiveChats_ = A1W2;
        int A025 = C18280x3.A02(AnonymousClass0x2.A0F(this.A06), "video_quality");
        AnonymousClass1E8 A0Y15 = AnonymousClass0x7.A0Y(A0G2);
        A0Y15.bitField0_ |= 16384;
        A0Y15.videoQualityMode_ = A025;
        int A026 = C18280x3.A02(AnonymousClass0x2.A0F(this.A06), "photo_quality");
        AnonymousClass1E8 A0Y16 = AnonymousClass0x7.A0Y(A0G2);
        A0Y16.bitField0_ |= 32768;
        A0Y16.photoQualityMode_ = A026;
        AnonymousClass1E2 r1 = (AnonymousClass1E2) C18320x8.A0C(r6);
        AnonymousClass1E8 r03 = (AnonymousClass1E8) A0G2.A06();
        r03.getClass();
        r1.globalSettings_ = r03;
        r1.bitField0_ |= 8;
    }

    public void A0M(C624134x r7) {
        AnonymousClass33C r1;
        String A0D2;
        long j = this.A02 + 1;
        this.A02 = j;
        int i = (int) ((((double) j) * 100.0d) / ((double) this.A00));
        if (this.A01 != i) {
            this.A01 = i;
            this.A0B.A09(i);
        }
        if (r7 instanceof C30471mV) {
            C95814uZ r12 = r7.A1J.A00;
            if (!(r12 instanceof C135166kE) && !(r12 instanceof AnonymousClass1fX) && !(r12 instanceof AnonymousClass1fY) && (r1 = ((C30471mV) r7).A01) != null && (A0D2 = A0D(r1.A0F)) != null) {
                r1.A0F = AnonymousClass002.A0B(A0D2);
            }
        }
    }

    public AnonymousClass36W(C56612sH r1, C55682qk r2, C56982ss r3, C56382rt r4, C61232zv r5, AnonymousClass1R1 r6, C72303dV r7, AnonymousClass33p r8, C55362qE r9, C84924Eg r10, C28851hs r11, C54612p0 r12, C57162tC r13) {
        this.A03 = r1;
        this.A04 = r2;
        this.A07 = r3;
        this.A09 = r4;
        this.A0A = r5;
        this.A0E = r6;
        this.A06 = r8;
        this.A08 = r7;
        this.A0C = r9;
        this.A0F = r10;
        this.A0B = r11;
        this.A0D = r12;
        this.A05 = r13;
    }

    public static int A01(String str) {
        return str.hashCode() & Integer.MAX_VALUE;
    }

    public static /* synthetic */ void A05() {
    }

    public List A0E(CancellationSignal cancellationSignal, AnonymousClass48I r25, OutputStream outputStream) {
        ArrayList A0s = AnonymousClass001.A0s();
        long j = 1;
        long A012 = this.A09.A01() + 1;
        this.A00 = (long) this.A09.A00(1, A012);
        this.A02 = 0;
        Map A0F2 = A0F();
        int i = 0;
        while (j < A012) {
            CancellationSignal cancellationSignal2 = cancellationSignal;
            cancellationSignal2.throwIfCanceled();
            AnonymousClass2LR r9 = new AnonymousClass2LR();
            long j2 = j;
            Cursor A0A2 = ((C67863Qy) r25).A00.A0A(5000, j2, A012, System.currentTimeMillis());
            if (A0A2 == null) {
                break;
            }
            try {
                r9.A01 = (long) A0A2.getCount();
                if (A0A2.moveToLast()) {
                    long A013 = C18270x1.A01(A0A2);
                    A0A2.moveToFirst();
                    A0A2.move(-1);
                    AnonymousClass1A0 A0B2 = A0B(A0A2, cancellationSignal2, A0F2);
                    if (A0B2 != null) {
                        A0B2.A09(i);
                        if (i == 0) {
                            A0L(A0B2);
                        }
                        ((AnonymousClass1E2) A0B2.A06()).A0E(outputStream);
                        r9.A00 = i;
                        int i2 = i;
                        A0s.add(r9);
                        i++;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("exportMessages - messages exporting in progress, batch number: ");
                        A0o.append(i2);
                        A0o.append("; batch start: ");
                        A0o.append(j);
                        A0o.append("; batch end: ");
                        A0o.append(A013);
                        A0o.append("; messages in batch: ");
                        A0o.append(r9.A01);
                        A0o.append("; total count: ");
                        A0o.append(this.A00);
                        A0o.append("; processed count: ");
                        C18260x0.A1H(A0o, this.A02);
                        A0A2.close();
                        j = A013;
                    }
                }
                A0A2.close();
                return A0s;
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
        return A0s;
    }

    public Map A0F() {
        long j;
        HashMap A0t = AnonymousClass001.A0t();
        Set A0R = this.A0E.A0R();
        if (A0R.size() != 0) {
            ArrayList A0I2 = AnonymousClass002.A0I(A0R.size());
            Iterator it = A0R.iterator();
            while (it.hasNext()) {
                Jid A0S = AnonymousClass0x7.A0S(it);
                C56802sa A002 = AnonymousClass1R1.A00(A0S, this.A0E);
                if (A002.A0H) {
                    j = A002.A05;
                } else {
                    j = 0;
                }
                AnonymousClass0x2.A1F(A0S, Long.valueOf(j), A0I2);
            }
            AnonymousClass4IU.A00(A0I2, 27);
            int i = 0;
            while (i < A0I2.size()) {
                i++;
                AnonymousClass0x2.A1I(((Pair) A0I2.get(i)).first, A0t, i);
            }
        }
        return A0t;
    }

    public void A0I(CancellationSignal cancellationSignal, AnonymousClass48I r19, File file) {
        AnonymousClass33M r0 = new AnonymousClass33M(false);
        r0.A09();
        this.A01 = 0;
        this.A0B.A09(0);
        long currentTimeMillis = System.currentTimeMillis();
        String valueOf = String.valueOf(Build.VERSION.SDK_INT);
        try {
            FileOutputStream A0h = AnonymousClass0x9.A0h(file);
            try {
                ZipOutputStream zipOutputStream = new ZipOutputStream(A0h);
                try {
                    zipOutputStream.putNextEntry(new ZipEntry("messages.bin"));
                    file.getParentFile();
                    List A0E2 = A0E(cancellationSignal, r19, zipOutputStream);
                    zipOutputStream.closeEntry();
                    AnonymousClass2OY r2 = new AnonymousClass2OY();
                    r2.A00 = "messages.bin";
                    r2.A01 = "protobuf";
                    r2.A02 = A0E2;
                    zipOutputStream.putNextEntry(new ZipEntry("header.json"));
                    JSONObject A1G = AnonymousClass0x9.A1G();
                    JSONObject A1G2 = AnonymousClass0x9.A1G();
                    A1G2.put("creation_date", currentTimeMillis);
                    A1G2.put("os", "android");
                    A1G2.put("os_version", valueOf);
                    A1G2.put("app_name", "consumer");
                    A1G2.put("app_version", "2.23.26.14");
                    A1G2.put("format_version", "1.0");
                    JSONObject A0z = C18300x5.A0z(A1G2, "header", A1G);
                    A1G.put("messages", A0z);
                    A0z.put("filename", r2.A00);
                    A0z.put("format", r2.A01);
                    JSONArray A1F = AnonymousClass0x9.A1F();
                    A0z.put("chunks", A1F);
                    List<AnonymousClass2LR> list = r2.A02;
                    if (list != null) {
                        for (AnonymousClass2LR r9 : list) {
                            JSONObject A1G3 = AnonymousClass0x9.A1G();
                            A1G3.put("chunk_number", r9.A00);
                            A1G3.put("messages_count", r9.A01);
                            A1F.put(A1G3);
                        }
                    }
                    AnonymousClass0x7.A1C(zipOutputStream, A1G.toString(4), DefaultCrypto.UTF_8);
                    zipOutputStream.closeEntry();
                    zipOutputStream.close();
                    A0h.close();
                    long A062 = r0.A06();
                    Locale locale = Locale.US;
                    Object[] A1X = AnonymousClass0x9.A1X();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    AnonymousClass000.A1Q(A1X, 0, timeUnit.toHours(A062));
                    AnonymousClass000.A1Q(A1X, 1, timeUnit.toMinutes(A062) - TimeUnit.HOURS.toMinutes(timeUnit.toHours(A062)));
                    AnonymousClass0x2.A1U(A1X, timeUnit.toSeconds(A062) - TimeUnit.MINUTES.toSeconds(timeUnit.toMinutes(A062)));
                    C18260x0.A0s("exportMessages - messages exporting is completed, consumed time: ", String.format(locale, "%02d:%02d:%02d", A1X), AnonymousClass001.A0o());
                } catch (IOException | JSONException e) {
                    Log.e("Failed to write header information.", e);
                    throw e;
                } catch (Throwable th) {
                    zipOutputStream.close();
                    throw th;
                }
            } catch (Throwable th2) {
                A0h.close();
                throw th2;
            }
        } catch (JSONException e2) {
            this.A0B.A08(1);
            Log.e("Failed to write metadata; data export is not completed.");
            file.delete();
            throw new IOException("Failed to write metadata; data export is not completed.", e2);
        } catch (Throwable th3) {
            th2.addSuppressed(th3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r3 != 0) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f A[PHI: r0 
      PHI: (r0v7 X.17q) = (r0v6 X.17q), (r0v11 X.17q) binds: [B:14:0x0057, B:16:0x005d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0K(X.C95814uZ r7, X.C209619z r8, java.util.Map r9) {
        /*
            r6 = this;
            java.lang.Number r0 = X.AnonymousClass0x9.A0q(r7, r9)
            if (r0 == 0) goto L_0x0017
            int r3 = r0.intValue()
            X.1EG r2 = X.C18290x4.A0U(r8)
            int r1 = r2.bitField0_
            r0 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.pinned_ = r3
        L_0x0017:
            X.1R1 r0 = r6.A0E
            X.2sa r5 = X.AnonymousClass1R1.A00(r7, r0)
            long r3 = r5.A00()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x007c
            long r3 = X.C18290x4.A0B(r3)
        L_0x002b:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x003c
        L_0x002f:
            X.1EG r2 = X.C18290x4.A0U(r8)
            int r1 = r2.bitField0_
            r0 = 4194304(0x400000, float:5.877472E-39)
            r1 = r1 | r0
            r2.bitField0_ = r1
            r2.muteEndTime_ = r3
        L_0x003c:
            int r1 = r5.A01
            r3 = 1
            if (r1 != r3) goto L_0x0076
            X.23C r0 = X.AnonymousClass23C.OFF
        L_0x0043:
            X.1EG r2 = X.C18290x4.A0U(r8)
            int r0 = r0.value
            r2.mediaVisibility_ = r0
            int r1 = r2.bitField0_
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0052:
            r0 = 0
            X.17q r0 = r6.A0C(r7, r0)
            if (r0 != 0) goto L_0x005f
            X.17q r0 = r6.A0C(r7, r3)
            if (r0 == 0) goto L_0x0075
        L_0x005f:
            X.1EG r2 = X.C18290x4.A0U(r8)
            X.6cX r0 = r0.A06()
            X.1BX r0 = (X.AnonymousClass1BX) r0
            r0.getClass()
            r2.wallpaper_ = r0
            int r1 = r2.bitField0_
            r0 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 | r0
            r2.bitField0_ = r1
        L_0x0075:
            return
        L_0x0076:
            r0 = 2
            if (r1 != r0) goto L_0x0052
            X.23C r0 = X.AnonymousClass23C.ON
            goto L_0x0043
        L_0x007c:
            if (r0 >= 0) goto L_0x002b
            r3 = 64092211200(0xeec318800, double:3.166575972E-313)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36W.A0K(X.4uZ, X.19z, java.util.Map):void");
    }
}
