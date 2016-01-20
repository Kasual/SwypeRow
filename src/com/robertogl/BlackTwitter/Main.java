package com.robertogl.BlackTwitter; 

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import android.content.res.XResources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.XC_MethodHook.MethodHookParam;
import de.robv.android.xposed.callbacks.XC_InitPackageResources.InitPackageResourcesParam;
import de.robv.android.xposed.callbacks.XC_LoadPackage.LoadPackageParam;

public class Main implements IXposedHookInitPackageResources, IXposedHookLoadPackage {
	@Override
    public void handleLoadPackage(final LoadPackageParam packageParam) throws Throwable {
		findAndHookMethod("com.lynxspa.bancopopolare.oZ", packageParam.classLoader, "ʻ", new XC_MethodReplacement() {
        	@Override
        	protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return false;
            }
                });
		
		findAndHookMethod("com.lynxspa.bancopopolare.oZ", packageParam.classLoader, "ʼ", new XC_MethodReplacement() {
        	@Override
        	protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return false;
            }
                });
		
		findAndHookMethod("com.lynxspa.bancopopolare.oZ", packageParam.classLoader, "ˊ", new XC_MethodReplacement() {
        	@Override
        	protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return false;
            }
                });
		
		findAndHookMethod("com.lynxspa.bancopopolare.oZ", packageParam.classLoader, "ˏ", new XC_MethodReplacement() {
        	@Override
        	protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return false;
            }
                });
		findAndHookMethod("com.lynxspa.bancopopolare.oZ", packageParam.classLoader, "ˎ", new XC_MethodReplacement() {
        	@Override
        	protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return false;
            }
                });
		
		findAndHookMethod("com.lynxspa.bancopopolare.oZ", packageParam.classLoader, "ˋ", new XC_MethodReplacement() {
        	@Override
        	protected Object replaceHookedMethod(MethodHookParam param) throws Throwable {
                return false;
            }
                });
	
	}
    @Override
    public void handleInitPackageResources(InitPackageResourcesParam resparam) throws Throwable {
        /*if (!resparam.packageName.equals("com.twitter.android"))
            return;*/
    	
        resparam.res.setReplacement("com.twitter.android", "color", "white", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_transparent_white", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_default_background", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "primary_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "secondary_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_transparent_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_transparent_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_transparent_faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_gray", Color.WHITE);
        
        resparam.res.setReplacement("com.twitter.android", "color", "ripple_transparent_faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "list_margin_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "list_bg", Color.WHITE);
        
        /*resparam.res.setReplacement("com.twitter.android", "color", "highlights_notification_story_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_notification_subtext", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_gradient_tint_start", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_subtext", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "notification_media_tint", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "notification_title_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "actionbar_divider", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "alert_hashtag", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "alerts_fill_pressed", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "audio_default_player_tint_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "black", Color.WHITE);*/
        resparam.res.setReplacement("com.twitter.android", "color", "border_contrast_dark", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "border_contrast_light", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_default_fill", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_default_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_pressed_fill", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_pressed_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_default_fill", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_default_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_disabled_fill", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_disabled_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_local_fill", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_local_pressed_fill", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_local_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_pressed_fill", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "btn_pressed_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "button_border", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "button_text_disabled", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "camera_shutter_bar", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "camera_shutter_bar_highlighted", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "clear", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "clip_track_zoom_out", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_action_bar_splitter", Color.WHITE);
        /*resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_dark_text_default", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_dark_text_disabled", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_dark_text_focused", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_dark_text_pressed", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_default_background", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_light_text_default", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_light_text_disabled", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_light_text_focused", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "common_signin_btn_light_text_pressed", Color.WHITE);*/
        resparam.res.setReplacement("com.twitter.android", "color", "composer_drawer_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "composer_replied_tweet", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "croppable_image_grid_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_orange", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_purple", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_red", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_theme_window_background", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_transparent_black", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_transparent_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dark_yellow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_debug_icon", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_debug_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_error_banner_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_error_banner_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_error_icon", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_error_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_info_icon", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_info_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_warning_icon", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "debug_card_previewer_warning_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_orange", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_purple", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_red", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_transparent_black", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_transparent_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_transparent_twitter_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "deep_yellow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dm_error_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dm_error_content", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dm_received_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dm_received_content", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dm_sent_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "dm_sent_content", Color.WHITE);
        //resparam.res.setReplacement("com.twitter.android", "color", "expandable_view_host_default_background_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_orange", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_purple", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_red", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faded_yellow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_night_mode_white", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_orange", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_purple", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_red", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_transparent_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_transparent_white", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "faint_yellow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "focused_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "form_error", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_empty_state_bg_bottom", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_empty_state_bg_top", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_notification_bg_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_notification_selected", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_notification_story_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_overlay_gradient_bottom", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_overlay_gradient_mid", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_overlay_gradient_top", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_stroke", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_transparent_faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_underlay", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "image_overlay", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_orange", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_purple", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_red", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_transparent_black", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "light_yellow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "lighter_transparent_black", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "link", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "link_selected", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "list_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "list_margin_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "media_border", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_orange", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_purple", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_red", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "medium_yellow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_attribution_text_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_bolt_sheet_bg_dim", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_bolt_sheet_dim", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_cover_page_dim", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_cover_page_divider_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_end_page_dim", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_end_page_divider_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_end_page_live_separator_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_live_green", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_progressbar_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_secondary_chrome_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_username_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "moments_username_color_dark", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "multiple_media_border", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "night_mode_pressed_fill", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "notification", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "notification_icon_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "pip_active", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "pip_inactive", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "placeholder_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "prefix", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "pressed", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "ripple_transparent_faded_gray", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "samsung_discover_widget_drop_shadow", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "secondary_text", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "select_stroke_color", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "share_via_dm_background", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "soft_white", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "strong_white", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "task_background_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "text_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "text_link", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "transparent_black", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "transparent_white", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "twitter_blue", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "unread", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "video_segment_selected", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "widget_single_flipper_layout_loading", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "widget_single_gradient_bg", Color.WHITE);
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_subtext", Color.WHITE);
        
        
        resparam.res.setReplacement("com.twitter.android", "color", "btn_default_fill", Color.BLACK);
        resparam.res.setReplacement("com.twitter.android", "color", "preference_category_text_color", Color.WHITE);
		resparam.res.setReplacement("com.twitter.android", "drawable", "bg_bottom_bar", new XResources.DrawableLoader() {
    		    @Override
    		    public Drawable newDrawable(XResources res, int id) throws Throwable {	   	    	
    		    	
    		    	Drawable draw = (Drawable) res.getDrawable(R.drawable.bg_bottom_bar);
    		    	draw.setColorFilter(Color.TRANSPARENT, Mode.MULTIPLY);
    		        return draw;
    		    }
        });
		/*resparam.res.setReplacement("com.twitter.android", "color", "list_margin_bg", modRes.fwd(R.color.list_margin_bg));
		resparam.res.setReplacement("com.twitter.android", "color", "list_bg", modRes.fwd(R.color.list_bg));
		resparam.res.setReplacement("com.twitter.android", "color", "focused_bg", modRes.fwd(R.color.focused_bg));
		resparam.res.setReplacement("com.twitter.android", "color", "placeholder_bg", modRes.fwd(R.color.placeholder_bg));
		resparam.res.setReplacement("com.twitter.android", "color", "media_border", modRes.fwd(R.color.media_border));
		resparam.res.setReplacement("com.twitter.android", "color", "light_gray", modRes.fwd(R.color.light_gray));
		resparam.res.setReplacement("com.twitter.android", "color", "light_blue", modRes.fwd(R.color.light_blue));
		resparam.res.setReplacement("com.twitter.android", "color", "image_overlay", modRes.fwd(R.color.image_overlay));
		resparam.res.setReplacement("com.twitter.android", "color", "actionbar_divider", modRes.fwd(R.color.actionbar_divider));
	    resparam.res.setReplacement("com.twitter.android", "color", "highlights_underlay", modRes.fwd(R.color.highlights_underlay));
	    resparam.res.setReplacement("com.twitter.android", "color", "deep_transparent_twitter_blue", modRes.fwd(R.color.deep_transparent_twitter_blue));
        resparam.res.setReplacement("com.twitter.android", "color", "deep_transparent_gray", modRes.fwd(R.color.deep_transparent_gray));
		resparam.res.setReplacement("com.twitter.android", "color", "deep_gray", modRes.fwd(R.color.deep_gray));
		resparam.res.setReplacement("com.twitter.android", "color", "deep_blue", modRes.fwd(R.color.deep_blue));
	    resparam.res.setReplacement("com.twitter.android", "color", "common_action_bar_splitter", modRes.fwd(R.color.common_action_bar_splitter));
        resparam.res.setReplacement("com.twitter.android", "color", "faint_gray", modRes.fwd(R.color.faint_gray));
        resparam.res.setReplacement("com.twitter.android", "color", "faint_blue", modRes.fwd(R.color.faint_blue));
        resparam.res.setReplacement("com.twitter.android", "color", "faded_gray", modRes.fwd(R.color.faded_gray));
        resparam.res.setReplacement("com.twitter.android", "color", "faded_blue", modRes.fwd(R.color.faded_blue));
        resparam.res.setReplacement("com.twitter.android", "color", "form_error", modRes.fwd(R.color.form_error));
		resparam.res.setReplacement("com.twitter.android", "color", "faint_transparent_white", modRes.fwd(R.color.faint_transparent_white));
		resparam.res.setReplacement("com.twitter.android", "color", "faint_transparent_blue", modRes.fwd(R.color.faint_transparent_blue));
		resparam.res.setReplacement("com.twitter.android", "color", "faint_transparent_black", modRes.fwd(R.color.faint_transparent_black));
		resparam.res.setReplacement("com.twitter.android", "color", "faint_night_mode_white", modRes.fwd(R.color.faint_night_mode_white));
	    resparam.res.setReplacement("com.twitter.android", "color", "dark_transparent_gray", modRes.fwd(R.color.dark_transparent_gray));
        resparam.res.setReplacement("com.twitter.android", "color", "dark_transparent_black", modRes.fwd(R.color.dark_transparent_black));
        resparam.res.setReplacement("com.twitter.android", "color", "clip_track_zoom_out", modRes.fwd(R.color.clip_track_zoom_out));
        resparam.res.setReplacement("com.twitter.android", "color", "camera_toolbar", modRes.fwd(R.color.camera_toolbar));
        resparam.res.setReplacement("com.twitter.android", "color", "camera_shutter_bar_highlighted", modRes.fwd(R.color.camera_shutter_bar_highlighted));
        resparam.res.setReplacement("com.twitter.android", "color", "camera_shutter_bar", modRes.fwd(R.color.camera_shutter_bar));
		resparam.res.setReplacement("com.twitter.android", "color", "camera_divider_line", modRes.fwd(R.color.camera_divider_line));
		resparam.res.setReplacement("com.twitter.android", "color", "button_text_disabled", modRes.fwd(R.color.button_text_disabled));
		resparam.res.setReplacement("com.twitter.android", "color", "btn_pressed_stroke", modRes.fwd(R.color.btn_pressed_stroke));
		resparam.res.setReplacement("com.twitter.android", "color", "btn_pressed_fill", modRes.fwd(R.color.btn_pressed_fill));
		resparam.res.setReplacement("com.twitter.android", "color", "btn_local_stroke", modRes.fwd(R.color.btn_local_stroke));
		resparam.res.setReplacement("com.twitter.android", "color", "btn_local_pressed_fill", modRes.fwd(R.color.btn_local_pressed_fill));
        resparam.res.setReplacement("com.twitter.android", "color", "btn_disabled_stroke", modRes.fwd(R.color.btn_disabled_stroke));
        resparam.res.setReplacement("com.twitter.android", "color", "btn_disabled_fill", modRes.fwd(R.color.btn_disabled_fill));
        resparam.res.setReplacement("com.twitter.android", "color", "btn_default_stroke", modRes.fwd(R.color.btn_default_stroke));
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_pressed_stroke", modRes.fwd(R.color.btn_active_pressed_stroke));
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_pressed_fill", modRes.fwd(R.color.btn_active_pressed_fill));
        resparam.res.setReplacement("com.twitter.android", "color", "btn_active_default_stroke", modRes.fwd(R.color.btn_active_default_stroke));
		resparam.res.setReplacement("com.twitter.android", "color", "btn_active_default_fill", modRes.fwd(R.color.btn_active_default_fill));
		resparam.res.setReplacement("com.twitter.android", "color", "border_contrast_light", modRes.fwd(R.color.border_contrast_light));
		resparam.res.setReplacement("com.twitter.android", "color", "border_contrast_dark", modRes.fwd(R.color.border_contrast_dark));
		resparam.res.setReplacement("com.twitter.android", "color", "alerts_fill_pressed", modRes.fwd(R.color.alerts_fill_pressed));
		resparam.res.setReplacement("com.twitter.android", "color", "alert_hashtag", modRes.fwd(R.color.alert_hashtag));
	    resparam.res.setReplacement("com.twitter.android", "color", "video_segment_selected", modRes.fwd(R.color.video_segment_selected));
		resparam.res.setReplacement("com.twitter.android", "color", "unread", modRes.fwd(R.color.unread));
		resparam.res.setReplacement("com.twitter.android", "color", "twitter_blue", modRes.fwd(R.color.twitter_blue));
		resparam.res.setReplacement("com.twitter.android", "color", "transparent_white", modRes.fwd(R.color.transparent_white));
        resparam.res.setReplacement("com.twitter.android", "color", "transparent_twitter_blue", modRes.fwd(R.color.transparent_twitter_blue));
        resparam.res.setReplacement("com.twitter.android", "color", "strong_white", modRes.fwd(R.color.strong_white));
        resparam.res.setReplacement("com.twitter.android", "color", "transparent_black", modRes.fwd(R.color.transparent_black));
        resparam.res.setReplacement("com.twitter.android", "color", "task_background_blue", modRes.fwd(R.color.task_background_blue));
        resparam.res.setReplacement("com.twitter.android", "color", "soft_white", modRes.fwd(R.color.soft_white));
        resparam.res.setReplacement("com.twitter.android", "color", "pressed", modRes.fwd(R.color.pressed));
		resparam.res.setReplacement("com.twitter.android", "color", "prefix", modRes.fwd(R.color.prefix));
		resparam.res.setReplacement("com.twitter.android", "color", "pip_inactive", modRes.fwd(R.color.pip_inactive));
		resparam.res.setReplacement("com.twitter.android", "color", "pip_active", modRes.fwd(R.color.pip_active));
		resparam.res.setReplacement("com.twitter.android", "color", "notification_icon_bg", modRes.fwd(R.color.notification_icon_bg));
		resparam.res.setReplacement("com.twitter.android", "color", "notification", modRes.fwd(R.color.notification));
        resparam.res.setReplacement("com.twitter.android", "color", "night_mode_pressed_fill", modRes.fwd(R.color.night_mode_pressed_fill));
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_subtext", modRes.fwd(R.color.magic_recs_subtext));
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_media_tint", modRes.fwd(R.color.magic_recs_media_tint));
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_gradient_tint_start", modRes.fwd(R.color.magic_recs_gradient_tint_start));
        resparam.res.setReplacement("com.twitter.android", "color", "magic_recs_big_text", modRes.fwd(R.color.magic_recs_big_text));
        resparam.res.setReplacement("com.twitter.android", "color", "link_selected", modRes.fwd(R.color.link_selected));
		resparam.res.setReplacement("com.twitter.android", "color", "lighter_transparent_black", modRes.fwd(R.color.lighter_transparent_black));
		resparam.res.setReplacement("com.twitter.android", "color", "light_transparent_black", modRes.fwd(R.color.light_transparent_black));
		resparam.res.setReplacement("com.twitter.android", "color", "highlights_transparent_faded_gray", modRes.fwd(R.color.highlights_transparent_faded_gray));
		resparam.res.setReplacement("com.twitter.android", "color", "highlights_stroke", modRes.fwd(R.color.highlights_stroke));
		resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_trend", modRes.fwd(R.color.highlights_story_header_trend));
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_trend", modRes.fwd(R.color.highlights_story_header_trend));
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_overlay_gradient_start", modRes.fwd(R.color.highlights_story_header_overlay_gradient_start));
        resparam.res.setReplacement("com.twitter.android", "color", "expandable_view_host_default_background_color", modRes.fwd(R.color.expandable_view_host_default_background_color));
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_news", modRes.fwd(R.color.highlights_story_header_news));
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_story_header_link", modRes.fwd(R.color.highlights_story_header_link));
        resparam.res.setReplacement("com.twitter.android", "color", "highlights_gray", modRes.fwd(R.color.highlights_gray));
		resparam.res.setReplacement("com.twitter.android", "color", "highlights_blue", modRes.fwd(R.color.highlights_blue));*/
        
    }
}