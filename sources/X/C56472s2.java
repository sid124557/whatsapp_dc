package X;

import android.content.ContentValues;
import android.database.Cursor;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2s2  reason: invalid class name and case insensitive filesystem */
public class C56472s2 {
    public final AnonymousClass1R9 A00;

    @Deprecated
    public void A03(C54942pX r7) {
        C85284Fq A0C = this.A00.A0C();
        try {
            ContentValues A06 = AnonymousClass0x9.A06();
            UserJid userJid = r7.A06;
            AnonymousClass0x2.A0n(A06, userJid, "jid");
            C18300x5.A12(A06, "latitude", r7.A00);
            C18300x5.A12(A06, "longitude", r7.A01);
            C18270x1.A0b(A06, "accuracy", r7.A03);
            A06.put("speed", Float.valueOf(r7.A02));
            C18270x1.A0b(A06, "bearing", r7.A04);
            AnonymousClass3H0.A02(A06, A0C, "location_ts", r7.A05).A0B("location_cache", "saveUserLocation/REPLACE_LOCATION_CACHE", A06);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingStore/saveUserLocation/saved user location; jid=");
            A0o.append(userJid);
            A0o.append("; timestamp=");
            C18260x0.A1I(A0o, r7.A05);
            A0C.close();
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public C56472s2(AnonymousClass1R9 r1) {
        this.A00 = r1;
    }

    public final List A00(long j, boolean z) {
        String str;
        Cursor A0E;
        long currentTimeMillis = System.currentTimeMillis();
        ArrayList A0s = AnonymousClass001.A0s();
        try {
            AnonymousClass4GK A0B = this.A00.get();
            try {
                C56862sg r7 = ((AnonymousClass3H0) A0B).A03;
                String str2 = C39052Am.A00;
                String[] A1Z = AnonymousClass0x9.A1Z();
                if (z) {
                    str = "1";
                } else {
                    str = "0";
                }
                A1Z[0] = str;
                C18280x3.A1T(A1Z, j);
                A0E = r7.A0E(str2, "getAllLocationSharers/QUERY_LOCATION_SHARER", A1Z);
                while (A0E.moveToNext()) {
                    C95814uZ A0K = AnonymousClass0x2.A0K(A0E, 0);
                    C58712vh r3 = null;
                    if (A0K != null) {
                        r3 = new C58712vh(A0E, A0K, AnonymousClass32Y.A00(A0E, 2));
                    }
                    if (r3 != null) {
                        A0s.add(r3);
                    }
                }
                A0E.close();
                A0B.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A19("LocationSharingStore/getAllLocationSharers/returned ", A0o, A0s);
                A0o.append(" location sharer; fromMe=");
                A0o.append(z);
                C18260x0.A13(" | time: ", A0o, currentTimeMillis);
                return A0s;
            } catch (Throwable th) {
                A0B.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/getAllLocationSharers/error getting sharers", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final void A01(long j, boolean z) {
        C85284Fq A0C;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            A0C = this.A00.A0C();
            C56862sg r8 = ((AnonymousClass3H0) A0C).A03;
            String[] A1a = AnonymousClass0x9.A1a();
            C18260x0.A1Y(A1a, j);
            C18280x3.A1T(A1a, 0);
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            A1a[2] = str;
            int A07 = r8.A07("location_sharer", "expires < ? AND expires > ? AND from_me = ?", "deleteOldLocationSharers/DELETE_LOCATION_SHARER", A1a);
            A0C.close();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingStore/deleteOldLocationSharers/deleted ");
            A0o.append(A07);
            C18260x0.A13(" location sharers | time: ", A0o, currentTimeMillis);
            return;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/deleteOldLocationSharers/delete failed", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @Deprecated
    public final void A02(C95814uZ r14, Collection collection, boolean z) {
        C69833Yo Axm;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axm = A0C.Axm();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    UserJid A0T = C18310x6.A0T(it);
                    C56862sg r7 = ((AnonymousClass3H0) A0C).A03;
                    String[] A1a = AnonymousClass0x9.A1a();
                    C18280x3.A0w(r14, A1a, 0);
                    C18310x6.A1D(A0T, A1a);
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    A1a[2] = str;
                    i += r7.A07("location_sharer", "remote_jid = ? AND remote_resource = ? AND from_me = ?", "deleteLocationSharers/DELETE_LOCATION_SHARERS", A1a);
                }
                Axm.A00();
                Axm.close();
                A0C.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSharingStore/deleteLocationSharers/deleted ");
                A0o.append(i);
                C18260x0.A13(" location sharers | time: ", A0o, currentTimeMillis);
                return;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/deleteLocationSharers/delete failed", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public final void A04(Iterable iterable, boolean z) {
        C69833Yo Axl;
        String str;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axl = A0C.Axl();
                Iterator it = iterable.iterator();
                int i = 0;
                while (it.hasNext()) {
                    C95814uZ A0P = C18300x5.A0P(it);
                    C56862sg r7 = ((AnonymousClass3H0) A0C).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18280x3.A0w(A0P, A1Z, 0);
                    if (z) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    A1Z[1] = str;
                    i += r7.A07("location_sharer", "remote_jid = ? AND from_me = ?", "deleteLocationSharers/DELETE_LOCATION_SHARER", A1Z);
                }
                Axl.A00();
                Axl.close();
                A0C.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSharingStore/deleteLocationSharers/deleted ");
                A0o.append(i);
                C18260x0.A13(" location sharers | time: ", A0o, currentTimeMillis);
                return;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/deleteLocationSharers/delete failed", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public void A05(Collection collection) {
        C69833Yo Axm;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axm = A0C.Axm();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    UserJid A0T = C18310x6.A0T(it);
                    C56862sg r6 = ((AnonymousClass3H0) A0C).A03;
                    String[] A1Y = AnonymousClass0x9.A1Y();
                    C18280x3.A0w(A0T, A1Y, 0);
                    i += r6.A07("location_cache", "jid = ?", "deleteUserLocations/DELETE_LOCATION_CACHE", A1Y);
                }
                Axm.A00();
                Axm.close();
                A0C.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSharingStore/deleteUserLocations/deleted ");
                A0o.append(i);
                C18260x0.A13(" location sharers | time: ", A0o, currentTimeMillis);
                return;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/deleteUserLocations/delete failed", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    @Deprecated
    public void A06(Collection collection, long j) {
        C69833Yo Axm;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axm = A0C.Axm();
                Iterator it = collection.iterator();
                int i = 0;
                while (it.hasNext()) {
                    AnonymousClass2QE r8 = (AnonymousClass2QE) it.next();
                    Iterator it2 = r8.A03.iterator();
                    while (it2.hasNext()) {
                        UserJid A0T = C18310x6.A0T(it2);
                        ContentValues A06 = AnonymousClass0x9.A06();
                        AnonymousClass2z0 r11 = r8.A02;
                        AnonymousClass0x2.A0n(A06, AnonymousClass2z0.A01(r11), "remote_jid");
                        A06.put("from_me", Boolean.TRUE);
                        AnonymousClass0x2.A0n(A06, A0T, "remote_resource");
                        C18270x1.A0c(A06, "expires", Math.min(r8.A01, j));
                        i += AnonymousClass001.A1U((AnonymousClass3H0.A03(A06, A0C, "message_id", r11.A01).A0B("location_sharer", "updateSharingExpire/REPLACE_LOCATION_SHARER", A06) > 0 ? 1 : (AnonymousClass3H0.A03(A06, A0C, "message_id", r11.A01).A0B("location_sharer", "updateSharingExpire/REPLACE_LOCATION_SHARER", A06) == 0 ? 0 : -1))) ? 1 : 0;
                    }
                }
                Axm.A00();
                Axm.close();
                A0C.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSharingStore/updateSharingExpire/update ");
                A0o.append(i);
                C18260x0.A13(" location sharers | time: ", A0o, currentTimeMillis);
                return;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/updateSharingExpire/save failed", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A07(List list) {
        C69833Yo Axm;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axm = A0C.Axm();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C58712vh r8 = (C58712vh) it.next();
                    ContentValues A06 = AnonymousClass0x9.A06();
                    AnonymousClass0x2.A0n(A06, r8.A01, "remote_jid");
                    UserJid userJid = r8.A02;
                    String str = null;
                    if (userJid != null) {
                        str = userJid.getRawString();
                    }
                    A06.put("remote_resource", str);
                    AnonymousClass2z0 r6 = r8.A03;
                    AnonymousClass0x2.A0o(A06, "from_me", r6.A02);
                    C18270x1.A0c(A06, "expires", r8.A00);
                    AnonymousClass3H0.A03(A06, A0C, "message_id", r6.A01).A0B("location_sharer", "saveLocationSharer/REPLACE_LOCATION_SHARER", A06);
                }
                Axm.A00();
                Axm.close();
                A0C.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1H("LocationSharingStore/saveLocationSharer/saved ", A0o, list);
                C18260x0.A13(" location sharers | time: ", A0o, currentTimeMillis);
                return;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/saveLocationSharer/save failed", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }

    public void A08(List list, boolean z) {
        C69833Yo Axl;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C85284Fq A0C = this.A00.A0C();
            try {
                Axl = A0C.Axl();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid A0T = C18310x6.A0T(it);
                    ContentValues A06 = AnonymousClass0x9.A06();
                    AnonymousClass0x2.A0n(A06, A0T, "jid");
                    AnonymousClass0x2.A0o(A06, "sent_to_server", z);
                    ((AnonymousClass3H0) A0C).A03.A0B("location_key_distribution", "storeLocationReceiverHasKey/REPLACE_LOCATION_KEY_DISTRIBUTION", A06);
                }
                Axl.A00();
                Axl.close();
                A0C.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                AnonymousClass000.A1H("LocationSharingStore/storeLocationReceiverHasKey/saved ", A0o, list);
                A0o.append(" location receiver has key: ");
                A0o.append(z);
                C18260x0.A13(" | time: ", A0o, currentTimeMillis);
                return;
            } catch (Throwable th) {
                A0C.close();
                throw th;
            }
            throw th;
        } catch (Exception e) {
            throw C18310x6.A0i("LocationSharingStore/storeLocationReceiverHasKey/save failed", e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
    }
}
