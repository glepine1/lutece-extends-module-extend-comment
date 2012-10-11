/*
 * Copyright (c) 2002-2012, Mairie de Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.extend.modules.comment.util.constants;


/**
 *
 * CommentConstants
 *
 */
public final class CommentConstants
{
    // PROPERTIES
    public static final String PROPERTY_XPAGE_VIEW_COMMENTS_PAGE_TITLE = "module.extend.comment.view_comments.pageTitle";
    public static final String PROPERTY_XPAGE_VIEW_COMMENTS_PATH_LABEL = "module.extend.comment.view_comments.pageLabel";
    public static final String PROPERTY_XPAGE_ADD_COMMENT_PAGE_TITLE = "module.extend.comment.add_comment.pageTitle";
    public static final String PROPERTY_XPAGE_ADD_COMMENT_PAGE_LABEL = "module.extend.comment.add_comment.pageLabel";
    public static final String PROPERTY_MANAGE_COMMENTS_PAGE_TITLE = "module.extend.comment.manage_comments.pageTitle";
    public static final String PROPERTY_COMMENT_CONFIG_LABEL_NO_MAILING_LIST = "module.extend.comment.comment_config.labelNoMailingList";

    // MESSAGES
    public static final String MESSAGE_CONFIRM_REMOVE_COMMENT = "module.extend.comment.message.confirm.removeComment";
    public static final String MESSAGE_ERROR_GENERIC_MESSAGE = "module.extend.comment.message.error.genericMessage";
    public static final String MESSAGE_NOTIFY_SUBJECT = "module.extend.comment.message.notify.subject";

    // PARAMETERS
    public static final String PARAMETER_ACTION = "action";
    public static final String PARAMETER_EXTENDER_TYPE = "extenderType";
    public static final String PARAMETER_ID_EXTENDABLE_RESOURCE = "idExtendableResource";
    public static final String PARAMETER_EXTENDABLE_RESOURCE_TYPE = "extendableResourceType";
    public static final String PARAMETER_ID_COMMENT = "idComment";

    // BEANS
    public static final String BEAN_CONFIG_SERVICE = "extend-comment.commentExtenderConfigService";

    // MARKS
    public static final String MARK_LIST_COMMENTS = "listComments";
    public static final String MARK_ID_EXTENDABLE_RESOURCE = "idExtendableResource";
    public static final String MARK_EXTENDABLE_RESOURCE_TYPE = "extendableResourceType";
    public static final String MARK_COMMENT_CONFIG = "commentConfig";
    public static final String MARK_MYLUTECE_USER = "myLuteceUser";
    public static final String MARK_LIST_IDS_MAILING_LIST = "listIdsMailingList";
    public static final String MARK_COMMENT = "comment";
    public static final String MARK_RESOURCE_EXTENDER_NAME = "resourceExtenderName";
    public static final String MARK_RESOURCE_EXTENDER_URL = "resourceExtenderUrl";
	public static final String MARK_PAGINATOR = "paginator";

    // ACTIONS
    public static final String ACTION_ADD_COMMENT = "addComment";
    public static final String ACTION_DO_ADD_COMMENT = "doAddComment";

	// CONSTANTS
	public static final String MARK_ASC_SORT = "asc_sort";

    /**
     * Instantiates a new comment constants.
     */
    private CommentConstants(  )
    {
    }
}