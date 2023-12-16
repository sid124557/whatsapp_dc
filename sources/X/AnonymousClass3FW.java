package X;

import android.content.SharedPreferences;
import android.database.Cursor;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.3FW  reason: invalid class name */
public class AnonymousClass3FW implements AnonymousClass4E8 {
    public final C45112Ys A00;
    public final C53072mV A01;
    public final C183538qC A02;

    public static SharedPreferences.Editor A00(SharedPreferences.Editor editor, String str, String str2, String str3) {
        return editor.putInt(str, 0).putInt(str2, 0).putInt(str3, 0);
    }

    public static Long A01(SharedPreferences sharedPreferences, String str, AbstractCollection abstractCollection) {
        Long valueOf = Long.valueOf((long) sharedPreferences.getInt(str, 0));
        abstractCollection.add(valueOf);
        return valueOf;
    }

    public void BQW() {
        int A022;
        int A023;
        int A024;
        int A025;
        Cursor A012;
        C85284Fq A04;
        C53072mV r5 = this.A01;
        if (r5.A03.A01()) {
            AnonymousClass1ZC r8 = new AnonymousClass1ZC();
            C183538qC r7 = r5.A01.A01;
            r8.A02 = AnonymousClass0x9.A0m(C18300x5.A0B(r7).getInt("sticker_suggestion_triggered_count", 0));
            r8.A00 = AnonymousClass0x9.A0m(C18300x5.A0B(r7).getInt("sticker_suggestion_icon_clicked_count", 0));
            r8.A01 = AnonymousClass0x9.A0m(C18300x5.A0B(r7).getInt("sticker_suggestion_sticker_sent_count", 0));
            r8.A03 = C18300x5.A0B(r7).getString("sticker_suggestion_num_suggestions_array", "[]");
            r5.A02.BhD(r8);
            C18270x1.A0j(A00(AnonymousClass0x2.A0E(r7), "sticker_suggestion_triggered_count", "sticker_suggestion_icon_clicked_count", "sticker_suggestion_sticker_sent_count"), "sticker_suggestion_num_suggestions_array", "[]");
            r5.A00 = null;
        }
        C45112Ys r0 = this.A00;
        C45112Ys r30 = r0;
        ArrayList A0s = AnonymousClass001.A0s();
        C46792cD r13 = r0.A01;
        ArrayList arrayList = A0s;
        Long A013 = A01(r13.A00(), "sticker_send_count", arrayList);
        Long A014 = A01(r13.A00(), "sticker_send_from_recent_count", arrayList);
        Long A015 = A01(r13.A00(), "sticker_send_from_favorites_count", arrayList);
        Long A016 = A01(r13.A00(), "sticker_send_from_pack_count", arrayList);
        ArrayList arrayList2 = A0s;
        Long A017 = A01(r13.A00(), "sticker_send_from_emotion_count", arrayList2);
        Long A018 = A01(r13.A00(), "sticker_send_from_search_count", arrayList2);
        Long A019 = A01(r13.A00(), "sticker_send_from_forward_count", arrayList2);
        Long A0110 = A01(r13.A00(), "sticker_send_first_party_count", arrayList2);
        Long A0111 = A01(r13.A00(), "sticker_send_animated_count", arrayList2);
        Object obj = r13.A04;
        synchronized (obj) {
            A022 = C18280x3.A02(r13.A00(), "sticker_picker_opened_count");
        }
        Long A0m = AnonymousClass0x9.A0m(A022);
        A0s.add(A0m);
        synchronized (obj) {
            A023 = C18280x3.A02(r13.A00(), "sticker_search_opened_count");
        }
        Long A0m2 = AnonymousClass0x9.A0m(A023);
        A0s.add(A0m2);
        synchronized (r13.A02) {
            A024 = C18280x3.A02(r13.A00(), "sticker_add_to_favorites_count");
        }
        Long A0m3 = AnonymousClass0x9.A0m(A024);
        A0s.add(A0m3);
        synchronized (r13.A03) {
            A025 = C18280x3.A02(r13.A00(), "sticker_pack_delete_count");
        }
        Long A0m4 = AnonymousClass0x9.A0m(A025);
        A0s.add(A0m4);
        C25771b3 r1 = new C25771b3();
        r1.A04 = A013;
        r1.A0B = A014;
        r1.A09 = A015;
        r1.A0A = A016;
        r1.A08 = A017;
        r1.A0C = A018;
        r1.A05 = A019;
        r1.A07 = A0110;
        r1.A06 = A0111;
        r1.A02 = A0m;
        r1.A03 = A0m2;
        r1.A00 = A0m3;
        r1.A01 = A0m4;
        Iterator it = A0s.iterator();
        while (true) {
            if (it.hasNext()) {
                Number number = (Number) it.next();
                if (number != null && number.longValue() > 0) {
                    r30.A00.BhD(r1);
                    C18270x1.A0h(A00(A00(A00(A00(r13.A00().edit(), "sticker_send_count", "sticker_send_from_recent_count", "sticker_send_from_favorites_count"), "sticker_send_from_pack_count", "sticker_send_from_emotion_count", "sticker_send_from_search_count"), "sticker_send_from_forward_count", "sticker_send_first_party_count", "sticker_send_animated_count"), "sticker_picker_opened_count", "sticker_search_opened_count", "sticker_add_to_favorites_count"), "sticker_pack_delete_count", 0);
                    break;
                }
            } else {
                break;
            }
        }
        C42922Qa r10 = (C42922Qa) this.A02.get();
        AnonymousClass33M A0112 = AnonymousClass33M.A01("cleanUpOrphanInternalStickerFiles");
        A0112.A09();
        C25091Zx r82 = new C25091Zx();
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass4GK A042 = C18630y0.A04(r10.A03);
        try {
            A012 = C56862sg.A01(((AnonymousClass3H0) A042).A03, "SELECT plaintext_hash FROM ( SELECT plain_file_hash as plaintext_hash FROM stickers UNION SELECT plaintext_hash as plaintext_hash FROM recent_stickers UNION SELECT plaintext_hash as plaintext_hash FROM starred_stickers )", "STICKER_REFERENCE_ALL_INTERNAL_STICKER_HASHES");
            int columnIndexOrThrow = A012.getColumnIndexOrThrow("plaintext_hash");
            while (A012.moveToNext()) {
                String string = A012.getString(columnIndexOrThrow);
                if (string != null) {
                    A0K.add(string);
                } else {
                    Log.e("InternalStickerFileReferenceManager/getAllInternalStickerPlainTextHashes/a sticker plaintextHash is null");
                }
            }
            A012.close();
            A042.close();
            for (C85164Fe r12 : r10.A02.A03()) {
                if (r12 instanceof AnonymousClass3QV) {
                    A0K.add(((AnonymousClass3QV) r12).A00.A0D);
                }
            }
            r82.A04 = Long.valueOf(A0112.A06());
            A0112.A08("finished db query");
            try {
                C56352rq r14 = r10.A00;
                File A0113 = C64393Dh.A01(C54292oU.A01(r14.A00), "Stickers");
                C626936e.A06(A0113);
                if (A0113.exists()) {
                    HashSet A0r = C18310x6.A0r(A0K);
                    Iterator it2 = A0K.iterator();
                    while (it2.hasNext()) {
                        String A0m5 = AnonymousClass001.A0m(it2);
                        StringBuilder A0o = AnonymousClass001.A0o();
                        AnonymousClass0x2.A1M(A0o, A0m5);
                        C18270x1.A1D(".webp", A0o, A0r);
                    }
                    String[] list = A0113.list();
                    C626936e.A06(list);
                    A0112.A08("finished string conversion");
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("cleanUpOrphanInternalStickerFiles/total file count: ");
                    C18260x0.A1G(A0o2, r11);
                    long A06 = A0112.A06();
                    long j = 0;
                    int i = 0;
                    for (String str : list) {
                        if (!str.endsWith(".png") && !A0r.contains(str)) {
                            C18260x0.A0q("cleanUpOrphanInternalStickerFiles/does not contain: ", str, AnonymousClass001.A0o());
                            File A0A = AnonymousClass002.A0A(A0113, str);
                            if (A0A.exists()) {
                                i++;
                                j += A0A.length();
                                C627536m.A0O(A0A);
                                AnonymousClass2Y6 r02 = r14.A03;
                                String absolutePath = A0A.getAbsolutePath();
                                A04 = r02.A01.A04();
                                ((AnonymousClass3H0) A04).A03.A07("media_refs", "path = ?", "DELETE_MEDIA_REF_SQL", C18270x1.A1b(absolutePath));
                                A04.close();
                                Log.d("ReferenceCountedFileManager/deleteFileAndAllReferences removed file");
                            }
                        }
                    }
                    r82.A03 = C18310x6.A0f(A0112.A06(), A06);
                    r82.A01 = AnonymousClass0x9.A0m(i);
                    r82.A02 = AnonymousClass0x9.A0o(j, 1024);
                    r82.A00 = AnonymousClass001.A0f();
                    A0112.A08("finished orphan file deletion");
                    C18260x0.A0y("cleanUpOrphanInternalStickerFiles/total orphan file count: ", AnonymousClass001.A0o(), i);
                    r10.A01.BhD(r82);
                    return;
                }
                return;
            } catch (Exception e) {
                Log.e("InternalStickerFileReferenceManager/cleanUpOrphanInternalStickerFiles/exception", e);
                r82.A00 = C18280x3.A0S();
                r82.A05 = e.getMessage();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            throw th;
            throw th;
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    public AnonymousClass3FW(C45112Ys r1, C53072mV r2, C183538qC r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public String BDW() {
        return "StickerDailyCron";
    }

    public /* synthetic */ void BQX() {
    }
}
