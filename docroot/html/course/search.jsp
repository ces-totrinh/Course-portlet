<%@ include file="/html/init.jsp"%>

<aui:row>
	<aui:col span="11">
		<aui:col span="4">
			<aui:input name="name" label="Name" inlineField="true"
				inlineLabel="left" />
		</aui:col>
		<aui:col span="4">
			<aui:input name="lecturer" label="Lecturer" inlineField="true"
				inlineLabel="left" />
		</aui:col>
		<aui:col span="4">
			<aui:select name="status" label="Status" inlineField="true"
				inlineLabel="left">
				<aui:option value="" selected="${ status eq '' }">All</aui:option>
				<aui:option value="true" selected="${ not status eq '' and Boolean.parseBoolean(status) }">Available</aui:option>
				<aui:option value="false" selected="${ not Boolean.parseBoolean(status) and not status eq '' }">Unavailable</aui:option>
			</aui:select>
		</aui:col>
	</aui:col>
	<aui:button type="submit" value="Search" icon="icon-search" />
</aui:row>