package X;

import android.content.ContentValues;
import android.database.sqlite.SQLiteConstraintException;
import android.os.CancellationSignal;
import android.text.TextUtils;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.36D  reason: invalid class name */
public class AnonymousClass36D {
    public static final int A0U = 3;
    public static final int A0V = 30;
    public static final String A0W = "MessagesImporter/";
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C56352rq A02;
    public final AnonymousClass4F4 A03;
    public final C56642sK A04;
    public final AnonymousClass310 A05;
    public final C56612sH A06;
    public final AnonymousClass33p A07;
    public final C56542sA A08;
    public final C56922sm A09;
    public final C56982ss A0A;
    public final AnonymousClass313 A0B;
    public final AnonymousClass2Y4 A0C;
    public final C620533h A0D;
    public final C55332qB A0E;
    public final C49512ge A0F;
    public final C56382rt A0G;
    public final C56362rr A0H;
    public final C620333f A0I;
    public final AnonymousClass1VX A0J;
    public final AnonymousClass33H A0K;
    public final AnonymousClass35S A0L;
    public final C44442Wb A0M;
    public final C28801hn A0N;
    public final C619032s A0O;
    public final C54612p0 A0P;
    public final AnonymousClass1R1 A0Q;
    public final C84924Eg A0R;
    public final C55832qz A0S;
    public final C183538qC A0T;

    public static int A00(C21651Cq r3) {
        int i = 0;
        if (r3 == null) {
            return 0;
        }
        int i2 = r3.bitField0_;
        if ((i2 & 1) != 0 && r3.downloadImages_) {
            i = 1;
        }
        if ((i2 & 2) != 0 && r3.downloadAudio_) {
            i |= 2;
        }
        if ((i2 & 4) != 0 && r3.downloadVideo_) {
            i |= 4;
        }
        if ((i2 & 8) == 0 || !r3.downloadDocuments_) {
            return i;
        }
        return i | 8;
    }

    public C624134x A08(C21411Bs r6) {
        if (r6 == null) {
            C44442Wb.A01(this.A0M, "import/msg/failed");
            Log.e("MessagesImporter/Conversation message is null.");
            return null;
        }
        AnonymousClass1ES r3 = r6.message_;
        if (r3 == null) {
            r3 = AnonymousClass1ES.DEFAULT_INSTANCE;
        }
        try {
            C624134x A042 = this.A0K.A04(new C50972j4(C371120z.FOR_CHAT_TRANSFER), r3);
            if (A042 != null) {
                return A042;
            }
            C44442Wb.A01(this.A0M, "import/msg/failed");
            A04(r3, "Parsed WMI message is null.", (Throwable) null);
            return null;
        } catch (Exception e) {
            C44442Wb.A01(this.A0M, "import/msg/failed");
            A04(r3, "Failed to parse message from WMI.", e);
            return null;
        }
    }

    public void A0C(CancellationSignal cancellationSignal, AnonymousClass31A r9, C83934Aj r10, AnonymousClass1ES r11, C624134x r12, byte[] bArr) {
        A0J(cancellationSignal, r10, r11, r12, bArr);
        if (r12.A1J.A02) {
            A0M(r9, r11, r12);
        }
        if (C627636p.A0w(r12, true)) {
            synchronized (r9) {
                r9.A0c = r12;
            }
            long j = r12.A1L;
            synchronized (r9) {
                r9.A0N = j;
            }
            long j2 = r12.A1M;
            synchronized (r9) {
                r9.A0O = j2;
            }
            r9.A0D(r12.A1M);
            r9.A0C(r12.A1L);
            C371321b r1 = r12.A0N;
            if (r9.A0Z == null) {
                r9.A0Z = r1;
            }
        }
        if (r12.A0K > r9.A02()) {
            r9.A0E(r12.A0K);
        }
    }

    public void A0N(C95814uZ r13, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            this.A08.A02((C371321b) null, r13, C69963Zi.A00(countDownLatch, 25), str, false);
            countDownLatch.await(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("MessagesImporter/Chat creation interrupted.", e);
        }
        if (countDownLatch.getCount() > 0) {
            throw new C36811zv(1, AnonymousClass000.A0P(r13, "Failed to create chat for ", AnonymousClass001.A0o()));
        }
    }

    public static InputStream A02(String str, String str2) {
        File A0B2 = AnonymousClass002.A0B(str);
        if (A0B2.exists()) {
            ZipInputStream zipInputStream = new ZipInputStream(AnonymousClass0x9.A0g(A0B2));
            try {
                for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                    if (nextEntry.getName().equalsIgnoreCase(str2)) {
                        return zipInputStream;
                    }
                }
                try {
                    zipInputStream.close();
                } catch (IOException unused) {
                }
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0p("Failed to find entry '", str2, "' in '", str, A0o);
                throw C18330xA.A05(AnonymousClass000.A0X("' archive.", A0o));
            } catch (IOException e) {
                C18280x3.A1C(C18260x0.A0B("MessagesImporter/Failed to read entry '", str2, "' in '", str, "' archive."), e);
                throw new IOException(C18260x0.A0B("MessagesImporter/Failed to read entry '", str2, "' in '", str, "' archive.").toString(), e);
            } catch (Throwable th) {
                try {
                    zipInputStream.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("Unable to locate input data file '");
            A0o2.append(str);
            throw C18330xA.A05(AnonymousClass000.A0X("'.", A0o2));
        }
    }

    private void A04(AnonymousClass1ES r6, String str, Throwable th) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        AnonymousClass1ET r0 = r6.key_;
        if (r0 == null) {
            r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
        }
        objArr[1] = r0.id_;
        objArr[2] = r6.A0M();
        AnonymousClass000.A1O(objArr, C18310x6.A05(r6));
        String format = String.format(locale, "%s; key=%s, stub_type=%s, params=%d", objArr);
        C18260x0.A0u(A0W, format, AnonymousClass001.A0o(), th);
        if (th != null) {
            this.A00.A09("xpm-msg-importer-parsing-failed", AnonymousClass000.A0P(th, "; ex=", AnonymousClass000.A0l(format)), th);
        } else {
            this.A00.A0A("xpm-msg-importer-parsing-failed", false, format);
        }
    }

    public AnonymousClass31A A07(CancellationSignal cancellationSignal, C95814uZ r24, C83934Aj r25, AnonymousClass1EG r26, Map map, Map map2, byte[] bArr) {
        int i;
        int i2;
        long j;
        int i3;
        C374322p r0;
        C95814uZ r13 = r24;
        AnonymousClass31A A0A2 = this.A0A.A0A(r13, false);
        Boolean bool = null;
        long j2 = 0;
        int i4 = 0;
        AnonymousClass1EG r15 = r26;
        if (A0A2 == null) {
            A0N(r13, r15.name_);
            if (r13 instanceof UserJid) {
                int i5 = r15.bitField0_;
                if (!((262144 & i5) == 0 || (i5 & 524288) == 0)) {
                    this.A04.A01((UserJid) r13, r15.tcToken_.A07(), r15.tcTokenTimestamp_);
                }
                if ((r15.bitField0_ & 33554432) != 0) {
                    this.A04.A0A((UserJid) r13, r15.tcTokenSenderTimestamp_);
                }
            }
            if (r15.messages_.size() > 0) {
                AnonymousClass1ES r02 = ((C21411Bs) r15.messages_.get(0)).message_;
                if (r02 == null) {
                    r02 = AnonymousClass1ES.DEFAULT_INSTANCE;
                }
                j = r02.messageTimestamp_ * 1000;
            } else {
                j = 0;
            }
            A0A2 = this.A0A.A0A(r13, false);
            if (A0A2 == null) {
                return null;
            }
            this.A09.A0N(A0A2.A04(Long.valueOf(j)), A0A2);
            A0E(cancellationSignal, r13, r25, r15, bArr);
            if (r13 instanceof C28011fL) {
                for (C21401Br r1 : r15.participant_) {
                    UserJid A082 = AnonymousClass32Y.A08(r1.userJid_);
                    if (A082 != null) {
                        if ((r1.bitField0_ & 2) != 0) {
                            int i6 = r1.rank_;
                            if (i6 != 0) {
                                if (i6 == 1) {
                                    r0 = C374322p.ADMIN;
                                } else if (i6 == 2) {
                                    r0 = C374322p.SUPERADMIN;
                                }
                                i3 = r0.value;
                            }
                            r0 = C374322p.REGULAR;
                            i3 = r0.value;
                        } else {
                            i3 = 0;
                        }
                        this.A0D.A0E(new C60842zG(A082, i3, false, true, true), (C28011fL) r13);
                    }
                }
            }
        }
        if ((r15.bitField0_ & DefaultCrypto.BUFFER_SIZE) == 0) {
            A0A2.A0A(0);
        } else if (r15.notSpam_) {
            A0A2.A0A(1);
        } else {
            A0A2.A0A(-1);
        }
        synchronized (A0A2) {
            A0A2.A00 = 1;
        }
        synchronized (A0A2) {
            A0A2.A0B = -1;
        }
        A0A2.A0E(r15.conversationTimestamp_ * 1000);
        if ((r15.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            String str = r15.name_;
            synchronized (A0A2) {
                A0A2.A0h = str;
            }
        }
        int i7 = r15.bitField0_;
        if ((i7 & 16384) != 0) {
            A0A2.A0i = r15.archived_;
        }
        if ((i7 & 128) != 0) {
            i = r15.ephemeralExpiration_;
        } else {
            i = 0;
        }
        if ((i7 & 256) != 0) {
            j2 = r15.ephemeralSettingTimestamp_;
        }
        if ((i7 & 32768) != 0) {
            AnonymousClass1EP r03 = r15.disappearingMode_;
            AnonymousClass1EP r6 = r03;
            if (r03 == null) {
                r03 = AnonymousClass1EP.DEFAULT_INSTANCE;
            }
            i4 = Math.min(3, Math.max(0, r03.A0M().value));
            if (r6 == null) {
                r6 = AnonymousClass1EP.DEFAULT_INSTANCE;
            }
            i2 = C18300x5.A02(C18320x8.A02(r6.A0N(), 0));
            AnonymousClass1EP r04 = r15.disappearingMode_;
            if (r04 == null) {
                r04 = AnonymousClass1EP.DEFAULT_INSTANCE;
            }
            bool = Boolean.valueOf(r04.initiatedByMe_);
        } else {
            i2 = 0;
        }
        AnonymousClass3Z2 r12 = A0A2.A0b;
        A0A2.A0B(Math.max(r12.expiration, i), Math.max(r12.ephemeralSettingTimestamp, j2), i4);
        if (C56952sp.A0G(this.A0J)) {
            A0A2.A0H(bool, i2);
        }
        map.put(r13, A0A2);
        map2.put(r13, r15);
        return A0A2;
    }

    public void A0A() {
        throw AnonymousClass002.A0C("Unsupported build version.");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        A0H(cancellationSignal, new C67873Qz(this.A0L));
    }

    public void A0E(CancellationSignal cancellationSignal, C95814uZ r16, C83934Aj r17, AnonymousClass1EG r18, byte[] bArr) {
        AnonymousClass1EG r2 = r18;
        if ((r2.bitField0_ & 8388608) != 0) {
            C95814uZ r3 = r16;
            if (this.A0R.BES(r3, true) == null) {
                AnonymousClass1BX r5 = r2.wallpaper_;
                if (r5 == null) {
                    r5 = AnonymousClass1BX.DEFAULT_INSTANCE;
                }
                C83934Aj r4 = r17;
                byte[] bArr2 = bArr;
                A0F(cancellationSignal, r3, r4, r5, bArr2, false);
                A0F(cancellationSignal, r3, r4, r5, bArr2, true);
            }
        }
    }

    public void A0F(CancellationSignal cancellationSignal, C95814uZ r12, C83934Aj r13, AnonymousClass1BX r14, byte[] bArr, boolean z) {
        StringBuilder sb;
        String str;
        int i;
        String str2 = r14.filename_;
        if (!TextUtils.isEmpty(str2)) {
            String A082 = this.A05.A08(AnonymousClass002.A0B(str2));
            try {
                File A092 = A09(A082, (byte) 1, true);
                if (!A092.exists()) {
                    try {
                        A0L(cancellationSignal, r13, A092, A082, bArr);
                        C44442Wb.A01(this.A0M, "import/msg/file/success");
                    } catch (IOException e) {
                        e = e;
                        C44442Wb.A01(this.A0M, "import/msg/file/failed");
                        sb = AnonymousClass001.A0o();
                        str = "MessagesImporter/cannot import file for wallpaper, file=";
                        C18260x0.A0u(str, A082, sb, e);
                    }
                }
                if ((r14.bitField0_ & 2) != 0) {
                    i = r14.opacity_;
                } else {
                    i = 100;
                }
                try {
                    this.A0R.Bkl(r12, new AnonymousClass2P1(Integer.valueOf(i), "USER_PROVIDED", A092.getCanonicalPath()), z);
                } catch (IOException e2) {
                    e = e2;
                    sb = AnonymousClass001.A0o();
                    str = "MessagesImporter/cannot get path for imported file, file=";
                    C18260x0.A0u(str, A082, sb, e);
                }
            } catch (IOException e3) {
                e = e3;
                sb = AnonymousClass001.A0o();
                str = "MessagesImporter/cannot get corrected media file for wallpaper, file=";
                C18260x0.A0u(str, A082, sb, e);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        r17 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G(android.os.CancellationSignal r26, X.AnonymousClass2OY r27, X.C83934Aj r28, java.lang.String r29) {
        /*
            r25 = this;
            java.lang.String r16 = "Failed to parse serialized messages file."
            java.lang.String r12 = "MessagesImporter/Failed to parse serialized messages file."
            r13 = r27
            java.util.List r0 = r13.A02
            if (r0 == 0) goto L_0x0103
            int r0 = r0.size()
            if (r0 == 0) goto L_0x0103
            r0 = 131072(0x20000, float:1.83671E-40)
            byte[] r11 = new byte[r0]
            java.util.List r0 = r13.A02
            int r10 = A01(r0)
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            java.util.HashMap r8 = X.AnonymousClass001.A0t()
            java.util.TreeMap r7 = new java.util.TreeMap
            r7.<init>()
            java.lang.String r0 = r13.A00
            r1 = r29
            java.io.InputStream r6 = A02(r1, r0)
            r5 = 0
            r4 = 0
        L_0x0031:
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x00f9 }
            int r0 = r0.size()     // Catch:{ all -> 0x00f9 }
            r3 = r25
            if (r4 >= r0) goto L_0x00ef
            java.util.List r0 = r13.A02     // Catch:{ all -> 0x00f9 }
            java.lang.Object r14 = r0.get(r4)     // Catch:{ all -> 0x00f9 }
            X.2LR r14 = (X.AnonymousClass2LR) r14     // Catch:{ all -> 0x00f9 }
            X.1E2 r0 = X.AnonymousClass1E2.DEFAULT_INSTANCE     // Catch:{ IOException -> 0x00e3 }
            X.6cX r2 = X.C130786cX.A04(r0, r6)     // Catch:{ IOException -> 0x00e3 }
            X.1E2 r2 = (X.AnonymousClass1E2) r2     // Catch:{ IOException -> 0x00e3 }
            if (r2 == 0) goto L_0x00db
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "MessagesImporter/Processing message chunk "
            r1.append(r0)     // Catch:{ all -> 0x00f9 }
            int r0 = r14.A00     // Catch:{ all -> 0x00f9 }
            r1.append(r0)     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "; data restore progress: "
            r1.append(r0)     // Catch:{ all -> 0x00f9 }
            int r0 = r5 * 100
            int r0 = r0 / r10
            X.C18260x0.A1F(r1, r0)     // Catch:{ all -> 0x00f9 }
            r18 = r26
            r20 = r28
            if (r4 != 0) goto L_0x0073
            r1 = r18
            r0 = r20
            r3.A0I(r1, r0, r2, r11)     // Catch:{ all -> 0x00f9 }
        L_0x0073:
            r1 = 0
        L_0x0074:
            X.8ya r0 = r2.conversations_     // Catch:{ all -> 0x00f9 }
            int r0 = r0.size()     // Catch:{ all -> 0x00f9 }
            if (r1 >= r0) goto L_0x00d7
            X.8ya r0 = r2.conversations_     // Catch:{ all -> 0x00f9 }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x00f9 }
            X.1EG r0 = (X.AnonymousClass1EG) r0     // Catch:{ all -> 0x00f9 }
            boolean r14 = r3.A0U(r0)     // Catch:{ all -> 0x00f9 }
            if (r14 == 0) goto L_0x00a4
            java.lang.StringBuilder r14 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f9 }
            java.lang.String r15 = "MessagesImporter/Skipping chat, messages count: "
            r14.append(r15)     // Catch:{ all -> 0x00f9 }
            X.8ya r0 = r0.messages_     // Catch:{ all -> 0x00f9 }
            int r0 = r0.size()     // Catch:{ all -> 0x00f9 }
            X.C18260x0.A1G(r14, r0)     // Catch:{ all -> 0x00f9 }
            X.2Wb r14 = r3.A0M     // Catch:{ all -> 0x00f9 }
            java.lang.String r0 = "import/chat/skipped"
            X.C44442Wb.A01(r14, r0)     // Catch:{ all -> 0x00f9 }
            goto L_0x00d4
        L_0x00a4:
            java.lang.String r14 = r0.id_     // Catch:{ all -> 0x00f9 }
            X.4uZ r19 = X.C18310x6.A0S(r14)     // Catch:{ all -> 0x00f9 }
            if (r19 == 0) goto L_0x00d4
            r22 = r9
            r23 = r8
            r24 = r11
            r21 = r0
            r17 = r3
            X.31A r19 = r17.A07(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ all -> 0x00f9 }
            if (r19 == 0) goto L_0x00d4
            X.8ya r14 = r0.messages_     // Catch:{ all -> 0x00f9 }
            r21 = r14
            r22 = r11
            r17.A0D(r18, r19, r20, r21, r22)     // Catch:{ all -> 0x00f9 }
            r3.A0P(r0, r7)     // Catch:{ all -> 0x00f9 }
            X.8ya r0 = r0.messages_     // Catch:{ all -> 0x00f9 }
            int r0 = r0.size()     // Catch:{ all -> 0x00f9 }
            int r5 = r5 + r0
            X.1hn r0 = r3.A0N     // Catch:{ all -> 0x00f9 }
            r0.A08(r5, r10)     // Catch:{ all -> 0x00f9 }
        L_0x00d4:
            int r1 = r1 + 1
            goto L_0x0074
        L_0x00d7:
            int r4 = r4 + 1
            goto L_0x0031
        L_0x00db:
            com.whatsapp.util.Log.e((java.lang.String) r12)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r1 = X.AnonymousClass002.A0C(r16)     // Catch:{ all -> 0x00f9 }
            goto L_0x00ee
        L_0x00e3:
            r2 = move-exception
            com.whatsapp.util.Log.e(r12, r2)     // Catch:{ all -> 0x00f9 }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00f9 }
            r0 = r16
            r1.<init>(r0, r2)     // Catch:{ all -> 0x00f9 }
        L_0x00ee:
            throw r1     // Catch:{ all -> 0x00f9 }
        L_0x00ef:
            r6.close()
            r3.A06(r9, r8)
            r3.A0T(r7)
            return
        L_0x00f9:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x00fe }
            throw r1
        L_0x00fe:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0103:
            java.lang.String r0 = "MessagesImporter/Messages chunks are not specified."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "Messages chunks are not specified."
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass36D.A0G(android.os.CancellationSignal, X.2OY, X.4Aj, java.lang.String):void");
    }

    public void A0I(CancellationSignal cancellationSignal, C83934Aj r15, AnonymousClass1E2 r16, byte[] bArr) {
        AnonymousClass1E2 r1 = r16;
        if ((r1.bitField0_ & 8) != 0) {
            AnonymousClass1E8 r3 = r1.globalSettings_;
            if (r3 == null) {
                r3 = AnonymousClass1E8.DEFAULT_INSTANCE;
            }
            CancellationSignal cancellationSignal2 = cancellationSignal;
            C83934Aj r9 = r15;
            byte[] bArr2 = bArr;
            if (AnonymousClass0x2.A1X(r3.bitField0_)) {
                AnonymousClass1BX r10 = r3.lightThemeWallpaper_;
                if (r10 == null) {
                    r10 = AnonymousClass1BX.DEFAULT_INSTANCE;
                }
                A0F(cancellationSignal2, (C95814uZ) null, r9, r10, bArr2, false);
            }
            if ((r3.bitField0_ & 4) != 0) {
                AnonymousClass1BX r102 = r3.darkThemeWallpaper_;
                if (r102 == null) {
                    r102 = AnonymousClass1BX.DEFAULT_INSTANCE;
                }
                A0F(cancellationSignal2, (C95814uZ) null, r9, r102, bArr2, true);
            }
            if (AnonymousClass000.A1S(r3.bitField0_ & 2)) {
                AnonymousClass23C A002 = AnonymousClass23C.A00(r3.mediaVisibility_);
                if (A002 == null) {
                    A002 = AnonymousClass23C.DEFAULT;
                }
                if (A002 != AnonymousClass23C.DEFAULT) {
                    AnonymousClass1R1 r5 = this.A0Q;
                    int i = 1;
                    if (AnonymousClass000.A1Y(A002, AnonymousClass23C.ON)) {
                        i = 2;
                    }
                    C56802sa A0M2 = r5.A0M("individual_chat_defaults");
                    if (i != A0M2.A01) {
                        A0M2.A01 = i;
                        r5.A0a(A0M2);
                    }
                }
            }
            if ((r3.bitField0_ & 8) != 0) {
                AnonymousClass33p r12 = this.A07;
                C21651Cq r0 = r3.autoDownloadWiFi_;
                if (r0 == null) {
                    r0 = C21651Cq.DEFAULT_INSTANCE;
                }
                C18270x1.A0h(C18270x1.A03(r12), "autodownload_wifi_mask", A00(r0));
            }
            if ((r3.bitField0_ & 16) != 0) {
                AnonymousClass33p r13 = this.A07;
                C21651Cq r02 = r3.autoDownloadCellular_;
                if (r02 == null) {
                    r02 = C21651Cq.DEFAULT_INSTANCE;
                }
                C18270x1.A0h(C18270x1.A03(r13), "autodownload_cellular_mask", A00(r02));
            }
            if ((r3.bitField0_ & 32) != 0) {
                AnonymousClass33p r14 = this.A07;
                C21651Cq r03 = r3.autoDownloadRoaming_;
                if (r03 == null) {
                    r03 = C21651Cq.DEFAULT_INSTANCE;
                }
                C18270x1.A0h(C18270x1.A03(r14), "autodownload_roaming_mask", A00(r03));
            }
            if ((r3.bitField0_ & 64) != 0) {
                AnonymousClass1R1.A01(this.A0Q, "individual_chat_defaults", !r3.showIndividualNotificationsPreview_);
            }
            if ((r3.bitField0_ & 128) != 0) {
                AnonymousClass1R1.A01(this.A0Q, "group_chat_defaults", true ^ r3.showGroupNotificationsPreview_);
            }
            if ((r3.bitField0_ & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                AnonymousClass1BU r04 = r3.avatarUserSettings_;
                if (r04 == null) {
                    r04 = AnonymousClass1BU.DEFAULT_INSTANCE;
                }
                A0O(r04);
            }
            if ((r3.bitField0_ & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                C18270x1.A0j(C18270x1.A03(this.A07), "interface_font_size", String.valueOf(r3.fontSize_));
            }
            if ((r3.bitField0_ & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                AnonymousClass33p r05 = this.A07;
                C18270x1.A0l(C18270x1.A03(r05), "security_notifications", r3.securityNotifications_);
            }
            if ((r3.bitField0_ & DefaultCrypto.BUFFER_SIZE) != 0) {
                AnonymousClass33p r06 = this.A07;
                C18270x1.A0l(C18270x1.A03(r06), "notify_new_message_for_archived_chats", r3.autoUnarchiveChats_);
            }
            if ((r3.bitField0_ & 16384) != 0) {
                AnonymousClass33p r07 = this.A07;
                C18270x1.A0h(C18270x1.A03(r07), "video_quality", r3.videoQualityMode_);
            }
            if ((r3.bitField0_ & 32768) != 0) {
                AnonymousClass33p r08 = this.A07;
                C18270x1.A0h(C18270x1.A03(r08), "photo_quality", r3.photoQualityMode_);
            }
            if ((r3.bitField0_ & 65536) != 0) {
                AnonymousClass1DV r09 = r3.individualNotificationSettings_;
                if (r09 == null) {
                    r09 = AnonymousClass1DV.DEFAULT_INSTANCE;
                }
                A0R(r09);
            }
            if ((r3.bitField0_ & AnonymousClass35S.A0F) != 0) {
                AnonymousClass1DV r010 = r3.groupNotificationSettings_;
                if (r010 == null) {
                    r010 = AnonymousClass1DV.DEFAULT_INSTANCE;
                }
                A0Q(r010);
            }
        }
    }

    public void A0K(CancellationSignal cancellationSignal, C83934Aj r14, C30471mV r15, byte[] bArr) {
        File file;
        boolean z;
        AnonymousClass33C r3 = r15.A01;
        if (r3 != null && (file = r3.A0F) != null) {
            String A082 = this.A05.A08(file);
            File A092 = A09(A082, r15.A1I, r15.A1J.A02);
            if (!A092.exists()) {
                try {
                    A0L(cancellationSignal, r14, A092, A082, bArr);
                    C44442Wb.A01(this.A0M, "import/msg/file/success");
                } catch (IOException e) {
                    C44442Wb.A01(this.A0M, "import/msg/file/failed");
                    C18260x0.A0u("MessagesImporter/processMediaMessage; cannot import file for message, file=", A082, AnonymousClass001.A0o(), e);
                    z = true;
                }
            }
            z = false;
            if (!A092.exists() || z) {
                r3.A0F = null;
                r3.A0R = false;
                return;
            }
            this.A02.A04(A092, 1, true);
            r3.A0F = A092;
            r3.A0R = true;
        }
    }

    public void A0O(AnonymousClass1BU r8) {
        if (r8 != null) {
            int i = r8.bitField0_;
            if ((i & 1) != 0 && (i & 2) != 0) {
                C166557yt r6 = new C166557yt(AnonymousClass3QD.A00(), Long.class, C18290x4.A0h(r8.fbid_), "WaFbid");
                C166557yt r0 = new C166557yt(AnonymousClass3QD.A00(), String.class, r8.password_, "WaFbPassword");
                C54612p0 r1 = this.A0P;
                C51952ke r5 = new C51952ke(r6, r0);
                AnonymousClass2AW r4 = new AnonymousClass2AW(r1, 2);
                C18320x8.A0M(r1.A02).A05(new C85974Ii(r4, 3), AnonymousClass2BB.A00, (C54662p5) null, r5);
            }
        }
    }

    public void A0P(AnonymousClass1EG r10, Map map) {
        int i;
        C95814uZ A0S2 = C18310x6.A0S(r10.id_);
        C626936e.A06(A0S2);
        if ((r10.bitField0_ & 2097152) != 0 && (i = r10.pinned_) > 0) {
            map.put(Integer.valueOf(i), A0S2);
        }
        if ((r10.bitField0_ & 4194304) != 0) {
            long j = r10.muteEndTime_;
            if (j > 0) {
                j *= 1000;
            }
            if (j != 0) {
                this.A0Q.A0k(A0S2, j);
            }
        }
        if ((r10.bitField0_ & EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING) != 0) {
            AnonymousClass23C A002 = AnonymousClass23C.A00(r10.mediaVisibility_);
            if (A002 == null) {
                A002 = AnonymousClass23C.DEFAULT;
            }
            if (A002 != AnonymousClass23C.DEFAULT) {
                AnonymousClass1R1 r3 = this.A0Q;
                int i2 = A002.value;
                C56802sa A003 = AnonymousClass1R1.A00(A0S2, r3);
                if (i2 != A003.A01) {
                    A003.A01 = i2;
                    r3.A0a(A003);
                }
            }
        }
    }

    public void A0Q(AnonymousClass1DV r5) {
        if (r5 != null) {
            if ((r5.bitField0_ & 1) != 0) {
                this.A0Q.A0e("group_chat_defaults", r5.messageVibrate_);
            }
            if ((r5.bitField0_ & 2) != 0) {
                this.A0Q.A0c("group_chat_defaults", r5.messagePopup_);
            }
            if ((r5.bitField0_ & 4) != 0) {
                this.A0Q.A0b("group_chat_defaults", r5.messageLight_);
            }
            if ((r5.bitField0_ & 8) != 0) {
                AnonymousClass1R1.A01(this.A0Q, "group_chat_defaults", r5.lowPriorityNotifications_);
            }
            if ((r5.bitField0_ & 16) != 0) {
                AnonymousClass1R1 r3 = this.A0Q;
                boolean z = r5.reactionsMuted_;
                C56802sa A0M2 = r3.A0M("group_chat_defaults");
                if (z != A0M2.A0G) {
                    A0M2.A0G = z;
                    r3.A0a(A0M2);
                }
            }
        }
    }

    public void A0R(AnonymousClass1DV r5) {
        if (r5 != null) {
            if ((r5.bitField0_ & 1) != 0) {
                this.A0Q.A0e("individual_chat_defaults", r5.messageVibrate_);
            }
            if ((r5.bitField0_ & 2) != 0) {
                this.A0Q.A0c("individual_chat_defaults", r5.messagePopup_);
            }
            if ((r5.bitField0_ & 4) != 0) {
                this.A0Q.A0b("individual_chat_defaults", r5.messageLight_);
            }
            if ((r5.bitField0_ & 8) != 0) {
                AnonymousClass1R1.A01(this.A0Q, "individual_chat_defaults", r5.lowPriorityNotifications_);
            }
            if ((r5.bitField0_ & 16) != 0) {
                AnonymousClass1R1 r3 = this.A0Q;
                boolean z = r5.reactionsMuted_;
                C56802sa A0M2 = r3.A0M("individual_chat_defaults");
                if (z != A0M2.A0G) {
                    A0M2.A0G = z;
                    r3.A0a(A0M2);
                }
            }
            if ((r5.bitField0_ & 32) != 0) {
                AnonymousClass1R1 r32 = this.A0Q;
                String str = r5.callVibrate_;
                C56802sa A0M3 = r32.A0M("individual_chat_defaults");
                if (!TextUtils.equals(str, A0M3.A09)) {
                    A0M3.A09 = str;
                    r32.A0a(A0M3);
                }
            }
        }
    }

    public void A0S(C30341mI r3) {
        int i = r3.A00;
        if ((i == 11 || i == 9) && C624134x.A0a(r3)) {
            r3.A1Z(this.A0A.A0D(AnonymousClass2z0.A00(r3)));
        }
    }

    public void A0T(TreeMap treeMap) {
        long A0H2 = this.A06.A0H();
        for (Number number : treeMap.descendingKeySet()) {
            int intValue = number.intValue();
            this.A0Q.A0O((C95814uZ) C18290x4.A0i(number, treeMap), A0H2 - ((long) intValue));
        }
    }

    public boolean A0U(AnonymousClass1EG r5) {
        C188248ya<C21411Bs> r3 = r5.messages_;
        if (r3.size() <= 3) {
            for (C21411Bs A082 : r3) {
                C624134x A083 = A08(A082);
                if (A083 == null || (A083 instanceof C30341mI)) {
                }
            }
            return true;
        }
        return false;
    }

    public AnonymousClass36D(C56612sH r2, AnonymousClass1VX r3, C56922sm r4, C55682qk r5, C56982ss r6, C56382rt r7, C64393Dh r8, C56362rr r9, C56542sA r10, AnonymousClass310 r11, AnonymousClass35S r12, C55832qz r13, C49512ge r14, AnonymousClass1R1 r15, C44442Wb r16, C619032s r17, C620333f r18, C56642sK r19, AnonymousClass33p r20, AnonymousClass33H r21, C620533h r22, C55332qB r23, AnonymousClass313 r24, AnonymousClass2Y4 r25, AnonymousClass4F4 r26, C84924Eg r27, C28801hn r28, C183538qC r29, C54612p0 r30, C56352rq r31) {
        this.A06 = r2;
        this.A0J = r3;
        this.A09 = r4;
        this.A00 = r5;
        this.A0A = r6;
        this.A0G = r7;
        this.A01 = r8;
        this.A0H = r9;
        this.A08 = r10;
        this.A05 = r11;
        this.A0L = r12;
        this.A0S = r13;
        this.A0F = r14;
        this.A0Q = r15;
        this.A0M = r16;
        this.A0O = r17;
        this.A0I = r18;
        this.A04 = r19;
        this.A07 = r20;
        this.A0K = r21;
        this.A0D = r22;
        this.A0E = r23;
        this.A0B = r24;
        this.A0C = r25;
        this.A03 = r26;
        this.A0R = r27;
        this.A0N = r28;
        this.A0T = r29;
        this.A0P = r30;
        this.A02 = r31;
    }

    public static int A01(List list) {
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (int) (((long) i) + ((AnonymousClass2LR) it.next()).A01);
        }
        return i;
    }

    private void A03(CancellationSignal cancellationSignal, File file) {
        FileOutputStream A0h;
        if (file.exists()) {
            C50982j5 r2 = (C50982j5) this.A0T.get();
            try {
                FileInputStream A0g = AnonymousClass0x9.A0g(file);
                try {
                    ZipInputStream zipInputStream = new ZipInputStream(A0g);
                    try {
                        byte[] bArr = new byte[AnonymousClass35S.A0F];
                        for (ZipEntry nextEntry = zipInputStream.getNextEntry(); nextEntry != null; nextEntry = zipInputStream.getNextEntry()) {
                            cancellationSignal.throwIfCanceled();
                            A0h = AnonymousClass0x9.A0h(r2.A00(nextEntry.getName()));
                            C619032s.A01(cancellationSignal, zipInputStream, A0h, bArr);
                            A0h.close();
                        }
                        zipInputStream.close();
                        A0g.close();
                        return;
                    } catch (Throwable th) {
                        zipInputStream.close();
                        throw th;
                    }
                } catch (Throwable th2) {
                    A0g.close();
                    throw th2;
                }
            } catch (IOException e) {
                Log.e("MessagesImporter/Failed to unpack files from archive.", e);
                r2.A02();
                throw e;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(file, "Unable to locate input data file '", A0o);
            throw C18330xA.A05(AnonymousClass000.A0X("'.", A0o));
        }
        throw th;
    }

    public static void A05(InputStream inputStream) {
        try {
            JSONObject A12 = AnonymousClass0x7.A12(DefaultCrypto.UTF_8, AnonymousClass72M.A00(inputStream));
            JSONObject jSONObject = A12.getJSONObject("header");
            AnonymousClass2T3 r7 = new AnonymousClass2T3();
            r7.A00 = jSONObject.getLong("creation_date");
            r7.A05 = jSONObject.getString("os");
            r7.A06 = jSONObject.getString("os_version");
            r7.A02 = jSONObject.getString("app_name");
            r7.A03 = jSONObject.getString("app_version");
            r7.A04 = jSONObject.getString("format_version");
            if (A12.has("messages")) {
                JSONObject jSONObject2 = A12.getJSONObject("messages");
                AnonymousClass2OY r6 = new AnonymousClass2OY();
                r6.A00 = jSONObject2.getString("filename");
                r6.A01 = jSONObject2.getString("format");
                if (jSONObject2.has("chunks")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("chunks");
                    ArrayList A0s = AnonymousClass001.A0s();
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                        AnonymousClass2LR r2 = new AnonymousClass2LR();
                        r2.A00 = jSONObject3.getInt("chunk_number");
                        r2.A01 = (long) jSONObject3.getInt("messages_count");
                        A0s.add(r2);
                    }
                    r6.A02 = A0s;
                }
                r7.A01 = r6;
            }
        } catch (IOException | JSONException e) {
            throw new IOException("Unable to parse JSON header.", e);
        }
    }

    private void A06(Map map, Map map2) {
        int i;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            AnonymousClass31A r7 = (AnonymousClass31A) A0w.getValue();
            AnonymousClass1EG r2 = (AnonymousClass1EG) map2.get(key);
            if (r2 != null) {
                int i2 = r2.bitField0_;
                if ((131072 & i2) != 0 && r2.markedAsUnread_) {
                    r7.A0G(-1, 0, 0, 0);
                } else if ((i2 & 16) != 0 && (i = r2.unreadCount_) > 0) {
                    long A042 = this.A0H.A04(this.A0G.A03(r7.A05(), i));
                    int A022 = this.A0H.A02(r7.A05(), A042);
                    r7.A0G(this.A0H.A00(r7.A05(), A042) - A022, A022, i, this.A0C.A00(r7.A05(), A042));
                }
                this.A09.A0N(r7.A04((Long) null), r7);
            }
        }
    }

    public File A09(String str, byte b, boolean z) {
        return AnonymousClass002.A0A(this.A01.A0K(b, 0, C18280x3.A01(z ? 1 : 0)), AnonymousClass002.A0B(str).getName());
    }

    public void A0D(CancellationSignal cancellationSignal, AnonymousClass31A r11, C83934Aj r12, List list, byte[] bArr) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C21411Bs r0 = (C21411Bs) it.next();
            CancellationSignal cancellationSignal2 = cancellationSignal;
            cancellationSignal.throwIfCanceled();
            C624134x A082 = A08(r0);
            if (A082 != null) {
                AnonymousClass1ES r6 = r0.message_;
                if (r6 == null) {
                    r6 = AnonymousClass1ES.DEFAULT_INSTANCE;
                }
                A0C(cancellationSignal2, r11, r12, r6, A082, bArr);
            }
        }
    }

    public void A0H(CancellationSignal cancellationSignal, C83934Aj r11) {
        String absolutePath = r11.getFile("migration/messages_export.zip").getAbsolutePath();
        try {
            InputStream A022 = A02(absolutePath, "header.json");
            try {
                JSONObject A12 = AnonymousClass0x7.A12(DefaultCrypto.UTF_8, AnonymousClass72M.A00(A022));
                JSONObject jSONObject = A12.getJSONObject("header");
                AnonymousClass2OY r2 = null;
                jSONObject.getLong("creation_date");
                jSONObject.getString("os");
                jSONObject.getString("os_version");
                jSONObject.getString("app_name");
                jSONObject.getString("app_version");
                jSONObject.getString("format_version");
                if (A12.has("messages")) {
                    JSONObject jSONObject2 = A12.getJSONObject("messages");
                    r2 = new AnonymousClass2OY();
                    r2.A00 = jSONObject2.getString("filename");
                    r2.A01 = jSONObject2.getString("format");
                    if (jSONObject2.has("chunks")) {
                        JSONArray jSONArray = jSONObject2.getJSONArray("chunks");
                        ArrayList A0s = AnonymousClass001.A0s();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
                            AnonymousClass2LR r4 = new AnonymousClass2LR();
                            r4.A00 = jSONObject3.getInt("chunk_number");
                            r4.A01 = (long) jSONObject3.getInt("messages_count");
                            A0s.add(r4);
                        }
                        r2.A02 = A0s;
                    }
                }
                A022.close();
                if (r2 != null && !TextUtils.isEmpty(r2.A00) && "protobuf".equalsIgnoreCase(r2.A01)) {
                    A0G(cancellationSignal, r2, r11, absolutePath);
                }
            } catch (IOException | JSONException e) {
                throw new IOException("Unable to parse JSON header.", e);
            } catch (Throwable th) {
                A022.close();
                throw th;
            }
        } catch (IOException e2) {
            throw new C36811zv("Unable to locate header metadata file in messages archive.", e2, 202);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A0J(CancellationSignal cancellationSignal, C83934Aj r6, AnonymousClass1ES r7, C624134x r8, byte[] bArr) {
        try {
            if (C624134x.A0g(r8)) {
                this.A03.Bh2(r7, r8);
            }
            r8.A1B(16384);
            if (r8 instanceof C30471mV) {
                A0K(cancellationSignal, r6, (C30471mV) r8, bArr);
            } else if (r8 instanceof C30341mI) {
                A0S((C30341mI) r8);
            }
            C624134x A0w = r8.A0w();
            if (A0w != null && (A0w instanceof C30471mV)) {
                A0K(cancellationSignal, r6, (C30471mV) A0w, bArr);
            }
            if (r8.A05 > 0) {
                this.A0B.A04(r8, r8.A0K);
            }
            this.A0S.A06(r8);
            C44442Wb.A01(this.A0M, "import/msg/success");
            this.A0I.A0D(r8);
        } catch (Exception e) {
            C44442Wb.A01(this.A0M, "import/msg/failed");
            Log.e("MessagesImporter/Failed to insert message.", e);
            C55682qk r2 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            C18270x1.A1H(A0o, "Failed to insert message: ", e);
            r2.A09("xpm-msg-importer-insert-failed", A0o.toString(), e);
        }
    }

    public void A0L(CancellationSignal cancellationSignal, C83934Aj r4, File file, String str, byte[] bArr) {
        this.A0O.A03(cancellationSignal, r4.getFile(str), file, bArr);
    }

    public void A0M(AnonymousClass31A r30, AnonymousClass1ES r31, C624134x r32) {
        HashSet hashSet;
        boolean z;
        C85284Fq A042;
        for (C21751Da r12 : r31.userReceipt_) {
            C624134x r11 = r32;
            try {
                C49512ge r15 = this.A0F;
                long j = r11.A1L;
                UserJid A082 = AnonymousClass32Y.A08(r12.userJid_);
                long j2 = r12.receiptTimestamp_ * 1000;
                long j3 = r12.readTimestamp_ * 1000;
                long j4 = r12.playedTimestamp_ * 1000;
                AnonymousClass2W3 A002 = r15.A00(j);
                int i = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
                if (i > 0) {
                    z = A002.A00(A082, 5, j2);
                } else {
                    z = false;
                }
                int i2 = (j3 > 0 ? 1 : (j3 == 0 ? 0 : -1));
                if (i2 > 0) {
                    z |= A002.A00(A082, 13, j3);
                }
                int i3 = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
                if (i3 > 0) {
                    z |= A002.A00(A082, 8, j4);
                }
                if (z) {
                    long A052 = r15.A01.A05(A082);
                    C626936e.A0F(AnonymousClass000.A1S((A052 > -1 ? 1 : (A052 == -1 ? 0 : -1))), "invalid jid");
                    ContentValues A072 = AnonymousClass0x9.A07(5);
                    C18270x1.A0a(A072, j);
                    C18270x1.A0c(A072, "receipt_user_jid_row_id", A052);
                    if (i > 0) {
                        C18270x1.A0c(A072, "receipt_timestamp", j2);
                    }
                    if (i2 > 0) {
                        C18270x1.A0c(A072, "read_timestamp", j3);
                    }
                    if (i3 > 0) {
                        C18270x1.A0c(A072, "played_timestamp", j4);
                    }
                    A042 = r15.A02.A04();
                    C56862sg r7 = ((AnonymousClass3H0) A042).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18260x0.A1X(A1Z, j);
                    C18270x1.A1R(A1Z, A052);
                    if (r7.A05(A072, "receipt_user", "message_row_id = ? AND receipt_user_jid_row_id = ?", "insertOrUpdateEntireUserReceiptForMessage/UPDATE_RECEIPT_USER", A1Z) > 0) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18310x6.A1N("ReceiptUserStore/insertOrUpdateEntireUserReceiptForMessage/updated; messageRowId=", "; userJidRowId=", A0o, j);
                        A0o.append(A052);
                        C18260x0.A10("; timestamp=", A0o, j2);
                    } else if (r7.A08("receipt_user", "insertOrUpdateEntireUserReceiptForMessage/INSERT_RECEIPT_USER", A072) == -1) {
                        Log.e("ReceiptUserStore/insertOrUpdateEntireUserReceiptForMessage/insert failed");
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        C18310x6.A1N("ReceiptUserStore/insertOrUpdateEntireUserReceiptForMessage/inserted; messageRowId=", "; userJidRowId=", A0o2, j);
                        A0o2.append(A052);
                        C18260x0.A10("; timestamp=", A0o2, j2);
                    }
                    A042.close();
                }
            } catch (SQLiteConstraintException e) {
                Log.e("MessagesImporter/Failed to insert user receipt.", e);
                this.A00.A09("xpm-failed-receipt-import", e.toString(), e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (r12.readTimestamp_ > 0) {
                long j5 = r11.A1L;
                AnonymousClass31A r2 = r30;
                synchronized (r2) {
                    r2.A0R = j5;
                }
                long j6 = r11.A1M;
                synchronized (r2) {
                    r2.A0S = j6;
                }
            }
            if (r12.pendingDeviceJid_.size() > 0) {
                hashSet = C18320x8.A0p(r12.pendingDeviceJid_);
                Iterator it = r12.pendingDeviceJid_.iterator();
                while (it.hasNext()) {
                    DeviceJid nullable = DeviceJid.getNullable(AnonymousClass001.A0m(it));
                    if (nullable != null) {
                        hashSet.add(nullable);
                    }
                }
            } else {
                hashSet = AnonymousClass002.A0K();
            }
            if (r12.deliveredDeviceJid_.size() > 0) {
                Iterator it2 = r12.deliveredDeviceJid_.iterator();
                while (it2.hasNext()) {
                    DeviceJid nullable2 = DeviceJid.getNullable(AnonymousClass001.A0m(it2));
                    if (nullable2 != null) {
                        hashSet.remove(nullable2);
                        try {
                            this.A0E.A02(nullable2, r11, r11.A0K);
                        } catch (SQLiteConstraintException e2) {
                            Log.e("MessagesImporter/Failed to insert device receipt.", e2);
                            this.A00.A09("xpm-failed-receipt-import", e2.toString(), e2);
                        }
                    }
                }
            }
            if (!hashSet.isEmpty()) {
                try {
                    this.A0E.A04(r11, hashSet);
                } catch (SQLiteConstraintException e3) {
                    Log.e("MessagesImporter/Failed to insert blank device receipt.", e3);
                    this.A00.A09("xpm-failed-receipt-import", e3.toString(), e3);
                }
            }
        }
        return;
        throw th;
    }
}
