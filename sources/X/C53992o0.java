package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.whatsapp.data.ProfilePhotoChange;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.2o0  reason: invalid class name and case insensitive filesystem */
public class C53992o0 {
    public final C55682qk A00;
    public final C56922sm A01;
    public final C381325v A02;
    public final C623334p A03;
    public final C72303dV A04;
    public final C40452Fw A05;
    public final C56082rO A06;
    public final C56662sM A07;
    public final AnonymousClass2YF A08;
    public final C45562aD A09;
    public final AnonymousClass2MN A0A;

    public long A00(C95814uZ r5) {
        Cursor A032;
        AnonymousClass4GK A033 = this.A04.get();
        try {
            String[] strArr = new String[1];
            C56922sm.A01(this.A01, r5, strArr);
            A032 = C56862sg.A03(A033, "SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND (action_type = 19 OR action_type = 67)", "GET_PLAINTEXT_DISABLED_MESSAGE_ROW_ID_SQL", strArr);
            if (A032.moveToFirst()) {
                long A042 = (long) AnonymousClass0x2.A04(A032, "_id");
                A032.close();
                A033.close();
                return A042;
            }
            A032.close();
            A033.close();
            return -1;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A01(C30341mI r19) {
        Throwable th;
        long j;
        Long l;
        long j2;
        long j3;
        C30341mI r5 = r19;
        C72303dV r3 = this.A04;
        C85284Fq A042 = r3.A04();
        try {
            C69833Yo Axl = A042.Axl();
            try {
                ContentValues A062 = AnonymousClass0x9.A06();
                A062.put("message_row_id", C624134x.A0A(r5));
                A062.put("action_type", Integer.valueOf(r5.A00));
                C56862sg r4 = ((AnonymousClass3H0) A042).A03;
                r4.A0C("message_system", "INSERT_MESSAGE_SYSTEM_SQL", A062, 5);
                if (r5 instanceof C31611oZ) {
                    C31611oZ r0 = (C31611oZ) r5;
                    ContentValues A063 = C624134x.A06(r0);
                    C621833x.A02(A063, "old_data", r0.A01);
                    r4.A0C("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", A063, 5);
                }
                if (r5 instanceof C31551oT) {
                    C31551oT r02 = (C31551oT) r5;
                    ContentValues A064 = C624134x.A06(r02);
                    C621833x.A02(A064, "old_data", r02.A00);
                    r4.A0C("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", A064, 5);
                }
                if (r5 instanceof C31601oY) {
                    C31601oY r03 = (C31601oY) r5;
                    ContentValues A065 = C624134x.A06(r03);
                    C621833x.A02(A065, "old_data", r03.A00);
                    r4.A0C("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", A065, 5);
                }
                if (r5 instanceof C31201nu) {
                    C31201nu r04 = (C31201nu) r5;
                    ContentValues A066 = C624134x.A06(r04);
                    C621833x.A02(A066, "old_data", r04.A00);
                    r4.A0C("message_system_value_change", "INSERT_MESSAGE_SYSTEM_VALUE_CHANGE_SQL", A066, 5);
                }
                if (r5 instanceof C31891p1) {
                    C31891p1 r9 = (C31891p1) r5;
                    ContentValues A067 = C624134x.A06(r9);
                    A067.put("is_me_joined", Integer.valueOf(r9.A00));
                    r4.A0C("message_system_group", "INSERT_MESSAGE_SYSTEM_GROUP_SQL", A067, 5);
                    Iterator it = r9.A01.iterator();
                    while (it.hasNext()) {
                        long A052 = this.A03.A05(C18310x6.A0T(it));
                        if (A052 >= 0) {
                            ContentValues A068 = C624134x.A06(r9);
                            C18270x1.A0c(A068, "user_jid_row_id", A052);
                            r4.A0C("message_system_chat_participant", "INSERT_MESSAGE_SYSTEM_CHAT_PARTICIPANTS", A068, 5);
                        }
                    }
                }
                if (r5 instanceof C31331o7) {
                    C31331o7 r2 = (C31331o7) r5;
                    ContentValues A069 = C624134x.A06(r2);
                    C621833x.A02(A069, "new_photo_id", r2.A1w());
                    ProfilePhotoChange profilePhotoChange = r2.A00;
                    if (profilePhotoChange != null) {
                        C621833x.A04(A069, "old_photo", profilePhotoChange.oldPhoto);
                        C621833x.A04(A069, "new_photo", r2.A00.newPhoto);
                        C621833x.A02(A069, "new_photo_id", String.valueOf(r2.A00.newPhotoId));
                    }
                    if (!TextUtils.isEmpty(r2.A1w()) || r2.A00 != null) {
                        r4.A0C("message_system_photo_change", "INSERT_TABLE_MESSAGE_SYSTEM_PHOTO_CHANGE", A069, 5);
                    }
                }
                if (r5 instanceof C31341o8) {
                    C31341o8 r22 = (C31341o8) r5;
                    UserJid userJid = r22.A01;
                    if (userJid != null) {
                        j2 = this.A03.A05(userJid);
                    } else {
                        j2 = -1;
                    }
                    UserJid userJid2 = r22.A00;
                    if (userJid2 != null) {
                        j3 = this.A03.A05(userJid2);
                    } else {
                        j3 = -1;
                    }
                    if (!(j2 == -1 && j3 == -1)) {
                        ContentValues A0610 = C624134x.A06(r22);
                        C621833x.A01(A0610, Long.valueOf(j2), "old_jid_row_id");
                        C621833x.A01(A0610, Long.valueOf(j3), "new_jid_row_id");
                        r4.A0C("message_system_number_change", "INSERT_TABLE_MESSAGE_SYSTEM_NUMBER_CHANGE", A0610, 5);
                    }
                }
                if (r5 instanceof C31291o3) {
                    C31291o3 r23 = (C31291o3) r5;
                    ContentValues A0611 = C624134x.A06(r23);
                    C621833x.A01(A0611, AnonymousClass0x9.A0m(r23.A00), "device_added_count");
                    C621833x.A01(A0611, AnonymousClass0x9.A0m(r23.A01), "device_removed_count");
                    r4.A0C("message_system_device_change", "INSERT_TABLE_MESSAGE_SYSTEM_DEVICE_CHANGE", A0611, 5);
                }
                if (r5 instanceof C31211nv) {
                    C31211nv r05 = (C31211nv) r5;
                    ContentValues A0612 = C624134x.A06(r05);
                    A0612.put("biz_state_id", Integer.valueOf(r05.A00));
                    r4.A0C("message_system_initial_privacy_provider", "INSERT_TABLE_MESSAGE_SYSTEM_INITIAL_PRIVACY_PROVIDER", A0612, 5);
                }
                if (r5 instanceof C31351o9) {
                    C31351o9 r8 = (C31351o9) r5;
                    ContentValues A0613 = C624134x.A06(r8);
                    UserJid userJid3 = r8.A01;
                    if (userJid3 != null) {
                        A0613.put("sender_jid_row_id", C623334p.A03(this.A03, userJid3));
                    }
                    UserJid userJid4 = r8.A00;
                    if (userJid4 != null) {
                        A0613.put("receiver_jid_row_id", C623334p.A03(this.A03, userJid4));
                    }
                    C621833x.A02(A0613, "amount_with_symbol", r8.A03);
                    AnonymousClass2z0 r82 = r8.A02;
                    if (r82 != null) {
                        C95814uZ r1 = r82.A00;
                        if (r1 != null) {
                            A0613.put("remote_message_sender_jid_row_id", C623334p.A03(this.A03, r1));
                        }
                        C621833x.A03(A0613, "remote_message_from_me", r82.A02);
                        C621833x.A02(A0613, "remote_message_key", r82.A01);
                    }
                    r4.A0C("message_payment", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT", A0613, 5);
                    if (r5 instanceof C31681og) {
                        C31681og r92 = (C31681og) r5;
                        ContentValues A0614 = C624134x.A06(r92);
                        C621833x.A02(A0614, "web_stub", r92.A02);
                        C621833x.A02(A0614, "amount", r92.A01);
                        C621833x.A02(A0614, "transfer_date", r92.A04);
                        C621833x.A02(A0614, "payment_sender_name", r92.A03);
                        A0614.put("expiration", Integer.valueOf(r92.A00));
                        r4.A0C("message_payment_transaction_reminder", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_TRANSACTION_REMINDER", A0614, 5);
                    }
                    if (r5 instanceof C31671of) {
                        C31671of r93 = (C31671of) r5;
                        ContentValues A0615 = C624134x.A06(r93);
                        C621833x.A02(A0615, "transaction_info", r93.A03);
                        C621833x.A02(A0615, "transaction_data", r93.A01);
                        C621833x.A02(A0615, "init_timestamp", r93.A02);
                        C621833x.A02(A0615, "update_timestamp", r93.A04);
                        C621833x.A02(A0615, "amount_data", r93.A00);
                        r4.A0C("message_payment_status_update", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_STATUS_UPDATE", A0615, 5);
                    }
                }
                if (r5 instanceof C31301o4) {
                    C31301o4 r24 = (C31301o4) r5;
                    C85284Fq A043 = this.A05.A00.A04();
                    try {
                        ContentValues A0E = C18290x4.A0E();
                        C18270x1.A0c(A0E, "message_row_id", r24.A1L);
                        C18270x1.A0b(A0E, "service", r24.A00);
                        AnonymousClass0x2.A0o(A0E, "invite_used", r24.A01);
                        ((AnonymousClass3H0) A043).A03.A08("message_system_payment_invite_setup", "INSERT_TABLE_MESSAGE_SYSTEM_PAYMENT_INVITE_SETUP", A0E);
                        A043.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                if (r5 instanceof C31541oS) {
                    C31541oS r83 = (C31541oS) r5;
                    C162457s7.A0J(r83, 1);
                    ContentValues A092 = C18280x3.A09();
                    C18270x1.A0c(A092, "message_row_id", r83.A1L);
                    A092.put("threshold", Integer.valueOf(r83.A00));
                    r4.A09("message_system_group_auto_restrict", "INSERT_TABLE_MESSAGE_SYSTEM_GROUP_AUTO_RESTRICT", A092);
                }
                if (r5 instanceof C31241ny) {
                    C31241ny r06 = (C31241ny) r5;
                    ContentValues A0616 = C624134x.A06(r06);
                    A0616.put("is_blocked", Integer.valueOf(r06.A00 ? 1 : 0));
                    r4.A0C("message_system_block_contact", "INSERT_TABLE_MESSAGE_SYSTEM_BLOCK_CONTACT", A0616, 5);
                }
                if (r5 instanceof C31261o0) {
                    C31261o0 r25 = (C31261o0) r5;
                    ContentValues A0617 = C624134x.A06(r25);
                    A0617.put("biz_opt_out_category", Integer.valueOf(r25.A01));
                    A0617.put("biz_opt_out_action", Integer.valueOf(r25.A00));
                    r4.A0C("message_system_opt_out", "INSERT_TABLE_MESSAGE_SYSTEM_BIZ_OPT_OUT", A0617, 5);
                }
                if (r5 instanceof C31251nz) {
                    C31251nz r07 = (C31251nz) r5;
                    ContentValues A0618 = C624134x.A06(r07);
                    A0618.put("setting_duration", Integer.valueOf(r07.A00));
                    r4.A0C("message_system_ephemeral_setting_not_applied", "INSERT_TABLE_MESSAGE_SYSTEM_EPHEMERAL_SETTING_NOT_APPLIED", A0618, 5);
                }
                if (r5 instanceof C31271o1) {
                    C31271o1 r26 = (C31271o1) r5;
                    C85284Fq A044 = r3.A04();
                    try {
                        ContentValues A0619 = C624134x.A06(r26);
                        A0619.put("business_name", r26.A01);
                        AnonymousClass3H0.A01(A0619, A044, "privacy_message_type", r26.A00).A08("message_system_business_state", "INSERT_SYSTEM_MESSAGE_BUSINESS_STATE", A0619);
                        A044.close();
                    } catch (Throwable th3) {
                        th = th3;
                        A044.close();
                        throw th;
                    }
                }
                if (r5 instanceof C31321o6) {
                    C31321o6 r27 = (C31321o6) r5;
                    ContentValues A0620 = C624134x.A06(r27);
                    C621833x.A02(A0620, "call_id", r27.A01);
                    A0620.put("is_video_call", Integer.valueOf(r27.A02 ? 1 : 0));
                    A0620.put("call_type", Integer.valueOf(r27.A00));
                    r4.A0C("message_system_linked_group_call", "INSERT_TABLE_MESSAGE_SYSTEM_LINKED_GROUP_CALL", A0620, 5);
                }
                if (r5 instanceof C31571oV) {
                    C31571oV r28 = (C31571oV) r5;
                    ContentValues A0621 = C624134x.A06(r28);
                    Integer num = r28.A02;
                    if (num == null) {
                        l = null;
                    } else {
                        l = C18310x6.A0g(num);
                    }
                    C621833x.A01(A0621, l, "old_group_type");
                    A0621.put("new_group_type", Integer.valueOf(r28.A00));
                    GroupJid groupJid = r28.A01;
                    if (groupJid == null) {
                        C18270x1.A0b(A0621, "linked_parent_group_jid_row_id", -1);
                    } else {
                        C18270x1.A0c(A0621, "linked_parent_group_jid_row_id", this.A03.A05(groupJid));
                    }
                    r4.A0C("message_system_community_link_changed", "INSERT_MESSAGE_SYSTEM_COMMUNITY_LINK_CHANGED", A0621, 5);
                }
                if (r5 instanceof C31561oU) {
                    C31561oU r08 = (C31561oU) r5;
                    ContentValues A0622 = C624134x.A06(r08);
                    String str = r08.A00;
                    if (str != null) {
                        A0622.put("linked_parent_group_name", str);
                    }
                    r4.A0C("message_system_group_with_parent", "INSERT_MESSAGE_SYSTEM_GROUP_WITH_PARENT_JID", A0622, 5);
                }
                if (r5 instanceof C31581oW) {
                    C31581oW r84 = (C31581oW) r5;
                    Iterator it2 = r84.A03.iterator();
                    while (it2.hasNext()) {
                        C52882mC A0O = AnonymousClass0x7.A0O(it2);
                        ContentValues A0623 = C624134x.A06(r84);
                        A0623.put("subgroup_raw_jid", A0O.A02.getRawString());
                        C621833x.A02(A0623, "subgroup_subject", A0O.A03);
                        C27991fJ r12 = r84.A01;
                        if (r12 == null) {
                            j = -1;
                        } else {
                            j = this.A03.A05(r12);
                        }
                        C18270x1.A0c(A0623, "parent_group_jid_row_id", j);
                        r4.A0C("message_system_sibling_group_link_change", "INSERT_TABLE_MESSAGE_SYSTEM_SIBLING_GROUP_CHANGE_LINK", A0623, 5);
                    }
                }
                if (r5 instanceof C31881p0) {
                    C31881p0 r32 = (C31881p0) r5;
                    for (C52662lq r122 : r32.A00) {
                        ContentValues A0624 = C624134x.A06(r32);
                        long A053 = this.A03.A05(r122.A01);
                        if (A053 == -1) {
                            C626936e.A0D(false, "BindMessageUtil/bindJidRowId/no jid row found");
                            this.A00.A0A("wa-community-event", true, "SystemMessageStore/insertSystemMessageWithGroupNodes/could not bind jid row id");
                        } else {
                            C18270x1.A0c(A0624, "group_jid_row_id", A053);
                            C621833x.A02(A0624, "group_subject", r122.A02);
                            A0624.put("group_node_type", Integer.valueOf(r122.A00));
                            r4.A0C("message_system_with_group_nodes", "INSERT_TABLE_MESSAGE_SYSTEM_WITH_GROUP_NODES", A0624, 5);
                        }
                    }
                }
                if (r5 instanceof C31281o2) {
                    C31281o2 r29 = (C31281o2) r5;
                    ContentValues A0625 = C624134x.A06(r29);
                    C621833x.A02(A0625, "agent_name", r29.A00);
                    A0625.put("is_unassigned_chat", Integer.valueOf(r29.A01 ? 1 : 0));
                    r4.A0C("message_system_chat_assignment", "INSERT_TABLE_MESSAGE_SYSTEM_CHAT_ASSIGNMENT", A0625, 5);
                }
                if (r5 instanceof C31311o5) {
                    C31311o5 r210 = (C31311o5) r5;
                    ContentValues A0626 = C18300x5.A06();
                    C18270x1.A0c(A0626, "message_row_id", r210.A1L);
                    A0626.put("creation_message_row_id", Long.valueOf(r210.A01));
                    A0626.put("call_timestamp_ms", Long.valueOf(r210.A00));
                    A0626.put("call_title", r210.A02);
                    r4.A0C("message_system_scheduled_call_start", "INSERT_TABLE_MESSAGE_SYSTEM_SCHEDULED_CALL_START", A0626, 5);
                }
                if (r5 instanceof C31231nx) {
                    C31231nx r211 = (C31231nx) r5;
                    ContentValues A0627 = C624134x.A06(r211);
                    A0627.put("original_message_row_id", Long.valueOf(r211.A00));
                    A0627.put("reminder_timestamp_ms", Long.valueOf(r211.A01));
                    String str2 = r211.A02;
                    if (str2 != null) {
                        A0627.put("reminder_content", str2);
                        r4.A0C("message_system_reminder_setup", "INSERT_TABLE_MESSAGE_SYSTEM_REMINDER_SETUP", A0627, 5);
                    } else {
                        throw C18270x1.A0S("reminderContent");
                    }
                }
                if (r5 instanceof C31221nw) {
                    C31221nw r52 = (C31221nw) r5;
                    ContentValues A0628 = C624134x.A06(r52);
                    A0628.put("original_message_row_id", Long.valueOf(r52.A00));
                    String str3 = r52.A01;
                    if (str3 != null) {
                        A0628.put("original_reminder_content", str3);
                        r4.A0C("message_system_reminder_sent", "INSERT_TABLE_MESSAGE_SYSTEM_REMINDER_SENT", A0628, 5);
                    } else {
                        throw C18270x1.A0S("originalReminderContent");
                    }
                }
                Axl.A00();
                Axl.close();
                A042.close();
            } catch (Throwable th4) {
                Axl.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                A042.close();
                throw th5;
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
                throw th5;
            }
        }
    }

    public final boolean A02(C95814uZ r7, int i) {
        Cursor A032;
        AnonymousClass4GK A033 = this.A04.get();
        try {
            String[] strArr = new String[2];
            boolean A034 = C56922sm.A03(this.A01, r7, strArr);
            strArr[1] = String.valueOf(i);
            A032 = C56862sg.A03(A033, "SELECT EXISTS( SELECT * FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id  WHERE chat_row_id = ?  AND action_type = ?) as message_exists", "HAS_MESSAGE_WITH_SYSTEM_ACTION_SQL", strArr);
            if (A032.moveToFirst() && AnonymousClass0x2.A04(A032, "message_exists") == 1) {
                A034 = true;
            }
            A032.close();
            A033.close();
            return A034;
        } catch (Throwable th) {
            try {
                A033.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public C53992o0(C55682qk r1, C56922sm r2, C381325v r3, C623334p r4, C72303dV r5, C40452Fw r6, C56082rO r7, C56662sM r8, AnonymousClass2YF r9, C45562aD r10, AnonymousClass2MN r11) {
        this.A03 = r4;
        this.A01 = r2;
        this.A00 = r1;
        this.A07 = r8;
        this.A06 = r7;
        this.A04 = r5;
        this.A08 = r9;
        this.A09 = r10;
        this.A05 = r6;
        this.A0A = r11;
        this.A02 = r3;
    }
}
