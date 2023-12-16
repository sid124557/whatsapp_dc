package X;

import android.database.Cursor;
import com.whatsapp.util.Log;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Fc  reason: invalid class name and case insensitive filesystem */
public class C64813Fc implements AnonymousClass4E8 {
    public final C66663Mh A00;
    public final C44762Xj A01;
    public final C65203Gp A02;
    public final C64663Ek A03;
    public final C613730l A04;
    public final AnonymousClass339 A05;
    public final C56792sZ A06;
    public final C55262q4 A07;
    public final C56612sH A08;
    public final AnonymousClass33p A09;
    public final C66543Lv A0A;
    public final AnonymousClass4FS A0B;

    /* JADX INFO: finally extract failed */
    public void BQW() {
        Cursor A0E;
        long j;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Long valueOf4;
        Long valueOf5;
        Long valueOf6;
        Long valueOf7;
        AnonymousClass4GK r12;
        Throwable th;
        Cursor A0E2;
        C18270x1.A0g(C613730l.A00(this.A04), "syncd_one_time_cleanup_for_non_md_user");
        C18270x1.A0g(C55262q4.A00(this.A07).remove("companion_rollout_random"), "previously_accessed_companion_mode");
        C64663Ek r3 = this.A03;
        C613730l r1 = r3.A01;
        long A012 = r1.A01("mutation_counter");
        long A013 = r1.A01("invalid_action_counter");
        C623934v r9 = r3.A04;
        AnonymousClass1RE r2 = r9.A01;
        AnonymousClass4GK A0B2 = r2.get();
        try {
            A0E = ((AnonymousClass3H0) A0B2).A03.A0E("SELECT COUNT(*) as count FROM syncd_mutations", "SyncdMutationsTable.COUNT_NUM_MUTATIONS", new String[0]);
            if (!A0E.moveToNext()) {
                A0E.close();
                A0B2.close();
                j = -1;
            } else {
                j = AnonymousClass0x2.A0C(A0E, "count");
                A0E.close();
                A0B2.close();
            }
            long A014 = r1.A01("upload_conflict_counter");
            long A015 = r1.A01("unsupported_action_counter");
            long A016 = r1.A01("cross_index_conflict_counter");
            long A017 = r1.A01("unset_action_mutation_counter");
            long A018 = r1.A01("key_rotation_remove_counter");
            long A019 = r1.A01("missing_key_counter");
            long[] jArr = {A012, A019, A013, j, A014, A018, A015, A016, A017};
            int i = 0;
            while (true) {
                if (jArr[i] <= 0) {
                    i++;
                    if (i >= 9) {
                        break;
                    }
                } else {
                    C25521ae r5 = new C25521ae();
                    r5.A04 = Long.valueOf(A012);
                    Long l = null;
                    if (A013 == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Long.valueOf(A013);
                    }
                    r5.A01 = valueOf;
                    if (j == -1) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Long.valueOf(j);
                    }
                    r5.A05 = valueOf2;
                    if (A014 == 0) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Long.valueOf(A014);
                    }
                    r5.A08 = valueOf3;
                    if (A015 == 0) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Long.valueOf(A015);
                    }
                    r5.A07 = valueOf4;
                    if (A016 == 0) {
                        valueOf5 = null;
                    } else {
                        valueOf5 = Long.valueOf(A016);
                    }
                    r5.A00 = valueOf5;
                    if (A017 == 0) {
                        valueOf6 = null;
                    } else {
                        valueOf6 = Long.valueOf(A017);
                    }
                    r5.A06 = valueOf6;
                    if (A018 == 0) {
                        valueOf7 = null;
                    } else {
                        valueOf7 = Long.valueOf(A018);
                    }
                    r5.A02 = valueOf7;
                    if (A019 != 0) {
                        l = Long.valueOf(A019);
                    }
                    r5.A03 = l;
                    C64663Ek.A05(r3, r5);
                }
            }
            AnonymousClass1VX r13 = r3.A05;
            C58422vE r8 = C58422vE.A02;
            if (r13.A0Y(r8, 1221)) {
                HashMap A0t = AnonymousClass001.A0t();
                r12 = r2.get();
                try {
                    Cursor A0E3 = ((AnonymousClass3H0) r12).A03.A0E("SELECT mutation_name, are_dependencies_missing, COUNT(*) AS mutation_count FROM syncd_mutations GROUP BY mutation_name, are_dependencies_missing", "SyncdMutationsTable.COUNT_MUTATIONS_GROUP_BY_MUTATION_NAME_AND_ARE_DEPENDENCIES_MISSING", new String[0]);
                    while (A0E3.moveToNext()) {
                        try {
                            String A0Z = AnonymousClass0x2.A0Z(A0E3, "mutation_name");
                            boolean A1S = AnonymousClass000.A1S((AnonymousClass0x2.A0C(A0E3, "are_dependencies_missing") > 0 ? 1 : (AnonymousClass0x2.A0C(A0E3, "are_dependencies_missing") == 0 ? 0 : -1)));
                            long A0C = AnonymousClass0x2.A0C(A0E3, "mutation_count");
                            C42402Ny r22 = (C42402Ny) A0t.get(A0Z);
                            if (r22 == null) {
                                r22 = new C42402Ny();
                            }
                            if (!A1S) {
                                r22.A00 += A0C;
                            } else {
                                C50962j3 r14 = r9.A02;
                                C162457s7.A0J(A0Z, 0);
                                C56822sc A002 = r14.A00(A0Z);
                                if (A002 == null || !A002.A0C()) {
                                    r22.A02 += A0C;
                                } else {
                                    r22.A01 += A0C;
                                }
                            }
                            A0t.put(A0Z, r22);
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    A0E3.close();
                    r12.close();
                    Iterator A0u = AnonymousClass001.A0u(A0t);
                    while (A0u.hasNext()) {
                        Map.Entry A0w = AnonymousClass001.A0w(A0u);
                        C42402Ny r52 = (C42402Ny) A0w.getValue();
                        long[] jArr2 = {r52.A00, r52.A01, r52.A02};
                        int i2 = 0;
                        while (true) {
                            if (jArr2[i2] <= 0) {
                                i2++;
                                if (i2 >= 3) {
                                    break;
                                }
                            } else {
                                AnonymousClass1Z2 r23 = new AnonymousClass1Z2();
                                r23.A00 = C64663Ek.A02(r52.A00);
                                r23.A01 = C64663Ek.A02(r52.A01);
                                r23.A02 = C64663Ek.A02(r52.A02);
                                r23.A03 = C18310x6.A0q(A0w);
                                C64663Ek.A05(r3, r23);
                                break;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r12.close();
                    throw th;
                }
            }
            C56792sZ r7 = this.A06;
            Log.i("SyncdKeyManager/dailyCronJob");
            C54312oW r92 = r7.A09;
            HashSet A0K = AnonymousClass002.A0K();
            AnonymousClass1RE r32 = r92.A00;
            r12 = r32.get();
            Cursor A0110 = C56862sg.A01(((AnonymousClass3H0) r12).A03, "SELECT crypto_info.device_id,  crypto_info.epoch FROM crypto_info LEFT JOIN syncd_mutations on crypto_info.device_id = syncd_mutations.device_id AND crypto_info.epoch = syncd_mutations.epoch WHERE syncd_mutations._id IS NULL AND crypto_info.stale_timestamp = 0 ", "SyncdCryptoInfoTable.SELECT_STALE_KEY_IDS_WHERE_TIMESTAMP_NOT_SET");
            while (A0110.moveToNext()) {
                try {
                    A0K.add(new AnonymousClass33J((int) AnonymousClass0x2.A0C(A0110, "device_id"), (int) AnonymousClass0x2.A0C(A0110, "epoch")));
                } catch (Throwable th4) {
                    th = th4;
                    if (A0110 != null) {
                        A0110.close();
                    }
                    throw th;
                }
            }
            A0110.close();
            r12.close();
            C60542yj A0111 = r7.A01();
            if (A0111 != null) {
                A0K.remove(A0111.A01);
            }
            long A0H = r7.A04.A0H();
            r92.A03(A0K, A0H);
            long millis = A0H - TimeUnit.DAYS.toMillis((long) r7.A01.A03(C66663Mh.A1S));
            C85284Fq A0C2 = r32.A0C();
            try {
                ((AnonymousClass3H0) A0C2).A03.A0I("DELETE FROM crypto_info WHERE stale_timestamp != 0  AND stale_timestamp <= ? ", "SyncdCryptoInfoTable.DELETE_STALE_KEY_IDS", C18260x0.A1b(millis));
                A0C2.close();
                AnonymousClass339 r72 = this.A05;
                Log.i("SyncEncryptionHelper/dailyCronJob");
                AnonymousClass1VX r33 = r72.A0B;
                if (r33.A0O(r8, 1104) != 0 && r72.A07.A0H() - AnonymousClass0x2.A0B(r72.A04.A02(), "syncd_last_lthash_consistency_check_time") >= C56952sp.A06(r33, 1104) * 3600000) {
                    r72.A0C.BkN(C69963Zi.A00(r72, 22), "SyncEncryptionHelper/checkLtHashConsistency");
                }
                C65203Gp r24 = this.A02;
                synchronized (r24) {
                    C68413Tb r82 = r24.A0A;
                    boolean z = false;
                    if (r82.A05.A02().getLong("syncd_last_companion_dereg_time", 0) != 0) {
                        if (!r82.A03() && !C29041iB.A00(r82.A07)) {
                            z = true;
                        }
                        C18260x0.A1E("SyncdDeleteAllDataApiHandler/shouldCleanUpSyncd: shouldCleanUpSyncd = ", AnonymousClass001.A0o(), z);
                        if (z) {
                            C626936e.A0C(AnonymousClass000.A1T(C56972sr.A0C(r24) ? 1 : 0));
                            r24.A0H(3);
                        }
                    }
                    C56792sZ r83 = r24.A0M;
                    C56302rl r0 = r83.A08;
                    C626936e.A00();
                    AnonymousClass4GK A0B3 = r0.A00.get();
                    try {
                        C56862sg r4 = ((AnonymousClass3H0) A0B3).A03;
                        String[] A1Y = AnonymousClass0x9.A1Y();
                        C18270x1.A1O(A1Y, 39);
                        A0E2 = r4.A0E("SELECT _id, message_type, key_remote_jid, key_from_me, key_id, timestamp, device_id, data, acked FROM peer_messages WHERE message_type = ?  ORDER BY timestamp ASC  LIMIT 1", "PeerMessagesTable.SELECT_OLDEST_MESSAGE_BY_MESSAGE_TYPE", A1Y);
                        if (!A0E2.moveToNext()) {
                            A0E2.close();
                            A0B3.close();
                        } else {
                            long A0C3 = AnonymousClass0x2.A0C(A0E2, "timestamp");
                            A0E2.close();
                            A0B3.close();
                            if (A0C3 != 0) {
                                if (A0C3 + TimeUnit.DAYS.toMillis((long) r83.A01.A03(C66663Mh.A1V)) < r83.A04.A0H()) {
                                    Log.i("sync-manager/deleteSyncdIfWaitForKeyTimedOut: fatal exception because wait for key timed out");
                                    r24.A0J(31);
                                }
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            A0B3.close();
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                        }
                        throw th5;
                    }
                }
                return;
            } catch (Throwable th7) {
                th.addSuppressed(th7);
                throw th;
            }
            throw th;
            throw th;
        } catch (Throwable th8) {
            th = th8;
            A0B2.close();
            throw th;
        }
    }

    public void BQX() {
        this.A0B.BkM(new C70613am(this.A08, this.A0A, this.A09, this.A01, 0, C18290x4.A0A(this.A00.A03(C66663Mh.A1w))));
    }

    public C64813Fc(C66663Mh r1, C44762Xj r2, C65203Gp r3, C64663Ek r4, C613730l r5, AnonymousClass339 r6, C56792sZ r7, C55262q4 r8, C56612sH r9, AnonymousClass33p r10, C66543Lv r11, AnonymousClass4FS r12) {
        this.A08 = r9;
        this.A0B = r12;
        this.A00 = r1;
        this.A02 = r3;
        this.A06 = r7;
        this.A0A = r11;
        this.A03 = r4;
        this.A09 = r10;
        this.A05 = r6;
        this.A01 = r2;
        this.A04 = r5;
        this.A07 = r8;
    }

    public String BDW() {
        return "CompanionDeviceDailyCron";
    }
}
