package X;

import android.database.Cursor;
import com.whatsapp.jid.Jid;

/* renamed from: X.4IG  reason: invalid class name */
public class AnonymousClass4IG implements C838249x {
    public Object A00;
    public final int A01;

    public AnonymousClass4IG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final Object BgS(Cursor cursor) {
        Integer num;
        switch (this.A01) {
            case 0:
                C25181a6 r4 = new C25181a6();
                int columnIndexOrThrow = cursor.getColumnIndexOrThrow("comment_space_id");
                int columnIndexOrThrow2 = cursor.getColumnIndexOrThrow("comments");
                int columnIndexOrThrow3 = cursor.getColumnIndexOrThrow("comment_deletes");
                int columnIndexOrThrow4 = cursor.getColumnIndexOrThrow("accumulated_comments");
                int columnIndexOrThrow5 = cursor.getColumnIndexOrThrow("comment_parent_group_id");
                int columnIndex = cursor.getColumnIndex("group_size_bucket");
                int columnIndexOrThrow6 = cursor.getColumnIndexOrThrow("cag_message_sent_ds");
                r4.A06 = cursor.getString(columnIndexOrThrow);
                r4.A04 = C18280x3.A0T(cursor, columnIndexOrThrow2);
                r4.A03 = C18280x3.A0T(cursor, columnIndexOrThrow3);
                r4.A01 = C18280x3.A0T(cursor, columnIndexOrThrow4);
                r4.A05 = cursor.getString(columnIndexOrThrow5);
                r4.A00 = C18300x5.A0a(cursor, columnIndex);
                r4.A02 = C18280x3.A0T(cursor, columnIndexOrThrow6);
                return r4;
            case 1:
                AnonymousClass1ZQ r42 = new AnonymousClass1ZQ();
                Jid A08 = ((C41412Kd) this.A00).A00.A08(cursor.getLong(cursor.getColumnIndexOrThrow("jid_row_id")));
                if (A08 == null) {
                    return null;
                }
                int columnIndexOrThrow7 = cursor.getColumnIndexOrThrow("home_group_discovery_count");
                int columnIndexOrThrow8 = cursor.getColumnIndexOrThrow("home_view_count");
                int columnIndexOrThrow9 = cursor.getColumnIndexOrThrow("home_group_join_count");
                int columnIndexOrThrow10 = cursor.getColumnIndexOrThrow("home_group_navigation_count");
                r42.A04 = A08.user;
                r42.A03 = C18280x3.A0T(cursor, columnIndexOrThrow8);
                r42.A00 = C18280x3.A0T(cursor, columnIndexOrThrow7);
                r42.A01 = C18280x3.A0T(cursor, columnIndexOrThrow9);
                r42.A02 = C18280x3.A0T(cursor, columnIndexOrThrow10);
                return r42;
            case 2:
                C25041Zs r43 = new C25041Zs();
                int columnIndexOrThrow11 = cursor.getColumnIndexOrThrow("community_id");
                int columnIndexOrThrow12 = cursor.getColumnIndexOrThrow("type_of_subgroup");
                int columnIndexOrThrow13 = cursor.getColumnIndexOrThrow("reaction_open_tray_count");
                int columnIndexOrThrow14 = cursor.getColumnIndexOrThrow("reaction_delete_count");
                int columnIndexOrThrow15 = cursor.getColumnIndexOrThrow("pnh_indicator_clicks_info_screen");
                int columnIndex2 = cursor.getColumnIndex("pnh_indicator_clicks_chat");
                r43.A05 = cursor.getString(columnIndexOrThrow11);
                r43.A00 = C18300x5.A0a(cursor, columnIndexOrThrow12);
                r43.A04 = C18280x3.A0T(cursor, columnIndexOrThrow13);
                r43.A03 = C18280x3.A0T(cursor, columnIndexOrThrow14);
                r43.A02 = C18280x3.A0T(cursor, columnIndexOrThrow15);
                r43.A01 = C18280x3.A0T(cursor, columnIndex2);
                return r43;
            default:
                C25551ah r44 = new C25551ah();
                int columnIndexOrThrow16 = cursor.getColumnIndexOrThrow("poll_id");
                int columnIndexOrThrow17 = cursor.getColumnIndexOrThrow("poll_votes");
                int columnIndexOrThrow18 = cursor.getColumnIndexOrThrow("poll_votes_changed");
                int columnIndexOrThrow19 = cursor.getColumnIndexOrThrow("poll_vote_deletes");
                int columnIndexOrThrow20 = cursor.getColumnIndexOrThrow("option_count");
                int columnIndex3 = cursor.getColumnIndex("users_participated");
                int columnIndexOrThrow21 = cursor.getColumnIndexOrThrow("poll_creation_ds");
                int columnIndexOrThrow22 = cursor.getColumnIndexOrThrow("is_a_group_flag");
                int columnIndexOrThrow23 = cursor.getColumnIndexOrThrow("group_size_bucket");
                r44.A04 = C18280x3.A0T(cursor, columnIndexOrThrow16);
                r44.A06 = C18280x3.A0T(cursor, columnIndexOrThrow17);
                r44.A07 = C18280x3.A0T(cursor, columnIndexOrThrow18);
                r44.A05 = C18280x3.A0T(cursor, columnIndexOrThrow19);
                r44.A02 = C18280x3.A0T(cursor, columnIndexOrThrow20);
                r44.A08 = C18280x3.A0T(cursor, columnIndex3);
                r44.A03 = C18280x3.A0T(cursor, columnIndexOrThrow21);
                boolean A1S = AnonymousClass000.A1S(cursor.getInt(columnIndexOrThrow22));
                r44.A00 = Boolean.valueOf(A1S);
                if (A1S) {
                    num = C18300x5.A0a(cursor, columnIndexOrThrow23);
                } else {
                    num = null;
                }
                r44.A01 = num;
                return r44;
        }
    }
}
